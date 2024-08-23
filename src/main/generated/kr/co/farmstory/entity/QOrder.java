package kr.co.farmstory.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QOrder is a Querydsl query type for Order
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QOrder extends EntityPathBase<Order> {

    private static final long serialVersionUID = -2045505939L;

    public static final QOrder order = new QOrder("order1");

    public final StringPath addr1 = createString("addr1");

    public final StringPath addr2 = createString("addr2");

    public final StringPath etc = createString("etc");

    public final StringPath hp = createString("hp");

    public final DateTimePath<java.time.LocalDateTime> odate = createDateTime("odate", java.time.LocalDateTime.class);

    public final NumberPath<Integer> ono = createNumber("ono", Integer.class);

    public final StringPath payment = createString("payment");

    public final StringPath receiver = createString("receiver");

    public final NumberPath<Integer> total = createNumber("total", Integer.class);

    public final StringPath uid = createString("uid");

    public final NumberPath<Integer> usepoint = createNumber("usepoint", Integer.class);

    public final StringPath zip = createString("zip");

    public QOrder(String variable) {
        super(Order.class, forVariable(variable));
    }

    public QOrder(Path<? extends Order> path) {
        super(path.getType(), path.getMetadata());
    }

    public QOrder(PathMetadata metadata) {
        super(Order.class, metadata);
    }

}

