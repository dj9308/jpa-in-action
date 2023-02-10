package jpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Product {
    @Id @GeneratedValue
    private long id;
    private String name;
    private int price;
    private int stockAmount;
}
