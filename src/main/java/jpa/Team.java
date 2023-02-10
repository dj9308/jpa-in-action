package jpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
@Entity
public class Team {
    @Id @GeneratedValue
    private long id;
    private String name;
    @OneToMany(mappedBy = "team")
    private List<Member> members;
}
