package vn.edu.iuh.fit.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;
import vn.edu.iuh.fit.enums.SkillLevel;
import vn.edu.iuh.fit.ids.CandidateSkillId;

import java.util.Objects;

@Entity
@Table(name = "candidate_skill")
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@ToString
@IdClass(CandidateSkillId.class)
public class CandidateSkill {
    @Column(name = "more_infos",length = 1000)
    private String moreInfos;
    @Column(name = "skill_level")
    private SkillLevel skillLevel;
    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "skill_id")
    private Skill skill;
    @Id
    @ManyToOne
    @JoinColumn(name = "can_id")
    private Candidate candidate;
}
