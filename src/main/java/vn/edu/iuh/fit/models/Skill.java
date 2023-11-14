package vn.edu.iuh.fit.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import vn.edu.iuh.fit.enums.SkillType;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "skill")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skill_id",length = 20)
    private long id;
    @Column(name = "skill_desc",length = 300)
    private String skillDescription;
    @Column(name = "skill_name",length = 150)
    private String skillName;
    private SkillType type;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "skill",fetch = FetchType.EAGER)
    private List<JobSkill> jobSkills;

    public Skill(String skillDescription, String skillName, SkillType type) {
        this.skillDescription = skillDescription;
        this.skillName = skillName;
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Skill skill = (Skill) o;
        return id == skill.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Skill(long id) {
        this.id = id;
    }
}
