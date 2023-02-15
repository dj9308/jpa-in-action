package jpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class Member {
    @Id @GeneratedValue
    private long id;
    private String username;
    private int age;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "TEAM_ID", foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
    private Team team;
    @OneToMany(mappedBy = "member")
    private List<Order> orders;
}
