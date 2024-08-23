package kr.co.farmstory.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QOrderlist is a Querydsl query type for Orderlist
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QOrderlist extends EntityPathBase<Orderlist> {

    private static final long serialVersionUID = 663732363L;

    public static final QOrderlist orderlist = new QOrderlist("orderlist");

    public final NumberPath<Integer> lno = createNumber("lno", Integer.class);

    public final NumberPath<Integer> ono = createNumber("ono", Integer.class);

    public final NumberPath<Integer> pcount = createNumber("pcount", Integer.class);

    public final NumberPath<Integer> pno = createNumber("pno", Integer.class);

    public final StringPath uid = createString("uid");

    public QOrderlist(String variable) {
        super(Orderlist.class, forVariable(variable));
    }

    public QOrderlist(Path<? extends Orderlist> path) {
        super(path.getType(), path.getMetadata());
    }

    public QOrderlist(PathMetadata metadata) {
        super(Orderlist.class, metadata);
    }

}

