package vn.edu.iuh.fit.models;

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
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "can_id")
    private Candidate candidate;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        CandidateSkill that = (CandidateSkill) o;
        return getSkill() != null && Objects.equals(getSkill(), that.getSkill())
                && getCandidate() != null && Objects.equals(getCandidate(), that.getCandidate());
    }

    @Override
    public final int hashCode() {
        return Objects.hash(skill, candidate);
    }
}
