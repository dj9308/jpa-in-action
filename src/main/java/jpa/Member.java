package jpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@NamedQuery(
        name = "Member.findByUsername",
        query = "select m from Member m where m.username = :username"
)
public class Member {
    @Id @GeneratedValue
    private long id;
    private String username;
    private int age;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TEAM_ID", foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
    private Team team;
    @OneToMany(mappedBy = "member")
    private List<Order> orders;
}
