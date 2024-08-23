package kr.co.farmstory.repository.custom;

import com.querydsl.core.Tuple;
import kr.co.farmstory.dto.ArticleDTO;

import java.util.List;

public interface ArticleRepositoryCustom {

    public List<Tuple> getArticleList(String grp, String cate);
}
