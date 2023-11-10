package vn.edu.iuh.fit.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import vn.edu.iuh.fit.enums.SkillType;

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

    public Skill(String skillDescription, String skillName, SkillType type) {
        this.skillDescription = skillDescription;
        this.skillName = skillName;
        this.type = type;
    }

    public Skill(long id) {
        this.id = id;
    }
}
