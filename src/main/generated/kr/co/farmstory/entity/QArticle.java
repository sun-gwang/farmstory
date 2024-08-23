package kr.co.farmstory.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QArticle is a Querydsl query type for Article
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QArticle extends EntityPathBase<Article> {

    private static final long serialVersionUID = 1838549077L;

    public static final QArticle article = new QArticle("article");

    public final NumberPath<Integer> ano = createNumber("ano", Integer.class);

    public final StringPath cate = createString("cate");

    public final NumberPath<Integer> comment = createNumber("comment", Integer.class);

    public final StringPath content = createString("content");

    public final NumberPath<Integer> file = createNumber("file", Integer.class);

    public final ListPath<File, QFile> filelist = this.<File, QFile>createList("filelist", File.class, QFile.class, PathInits.DIRECT2);

    public final NumberPath<Integer> good = createNumber("good", Integer.class);

    public final StringPath grp = createString("grp");

    public final NumberPath<Integer> hate = createNumber("hate", Integer.class);

    public final NumberPath<Integer> hit = createNumber("hit", Integer.class);

    public final NumberPath<Integer> parent = createNumber("parent", Integer.class);

    public final DateTimePath<java.time.LocalDateTime> rdate = createDateTime("rdate", java.time.LocalDateTime.class);

    public final StringPath regip = createString("regip");

    public final StringPath title = createString("title");

    public final StringPath uid = createString("uid");

    public QArticle(String variable) {
        super(Article.class, forVariable(variable));
    }

    public QArticle(Path<? extends Article> path) {
        super(path.getType(), path.getMetadata());
    }

    public QArticle(PathMetadata metadata) {
        super(Article.class, metadata);
    }

}

