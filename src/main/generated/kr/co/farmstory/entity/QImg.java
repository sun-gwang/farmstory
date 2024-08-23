package kr.co.farmstory.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QImg is a Querydsl query type for Img
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QImg extends EntityPathBase<Img> {

    private static final long serialVersionUID = -1968612702L;

    public static final QImg img = new QImg("img");

    public final StringPath img1 = createString("img1");

    public final StringPath img2 = createString("img2");

    public final StringPath img3 = createString("img3");

    public final NumberPath<Integer> ino = createNumber("ino", Integer.class);

    public final NumberPath<Integer> pno = createNumber("pno", Integer.class);

    public QImg(String variable) {
        super(Img.class, forVariable(variable));
    }

    public QImg(Path<? extends Img> path) {
        super(path.getType(), path.getMetadata());
    }

    public QImg(PathMetadata metadata) {
        super(Img.class, metadata);
    }

}

