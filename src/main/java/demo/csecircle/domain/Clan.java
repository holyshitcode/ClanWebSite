package demo.csecircle.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Clan {

    @Id
    @GeneratedValue
    @Column(name = "clan_id")
    private Long id;

    private String clanName;

    @OneToMany(mappedBy = "clan")
    private List<Member> members;
}
