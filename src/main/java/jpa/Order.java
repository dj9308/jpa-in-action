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
    @JoinColumn(name = "MEMBER_ID")
    private Member member;
    @OneToOne
    @JoinColumn(name = "PRODUCT_ID")
    private Product product;
}