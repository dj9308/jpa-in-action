package jpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "TB_ORDER")
public class Order {
    @Id @GeneratedValue
    private long id;
    private int orderAmount;
    @Embedded
    private Address address;
    @ManyToOne
    @JoinColumn(name = "MEMBER_ID", foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
    private Member member;
    @OneToOne
    @JoinColumn(name = "PRODUCT_ID", foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
    private Product product;
}