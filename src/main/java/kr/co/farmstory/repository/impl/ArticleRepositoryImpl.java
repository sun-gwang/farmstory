package kr.co.farmstory.repository.impl;

import com.querydsl.core.Tuple;
import kr.co.farmstory.dto.ArticleDTO;
import kr.co.farmstory.entity.QArticle;
import kr.co.farmstory.entity.QUser;
import kr.co.farmstory.repository.custom.ArticleRepositoryCustom;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Slf4j
@Repository
@RequiredArgsConstructor
public class ArticleRepositoryImpl implements ArticleRepositoryCustom {

    private final JPAQueryFactory jpaQueryFactory;
    private final QArticle qArticle = QArticle.article;
    private final QUser qUser = QUser.user;

    @Override
    public List<Tuple> getArticleList(String grp, String cate) {

        return jpaQueryFactory
                .select(qArticle, qUser.nick)
                .from(qArticle)
                .join(qUser).on(qArticle.uid.eq(qUser.uid))
                .where(
                        qArticle.grp.eq(grp),
                        qArticle.cate.eq(cate),
                        qArticle.parent.eq(0)
                )
                .fetch();

    }
}
