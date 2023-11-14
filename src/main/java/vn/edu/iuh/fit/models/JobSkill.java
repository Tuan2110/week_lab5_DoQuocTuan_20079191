package vn.edu.iuh.fit.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import vn.edu.iuh.fit.enums.SkillLevel;
import vn.edu.iuh.fit.ids.JobSkillId;

@Entity
@Table(name = "job_skill")
@Data
@AllArgsConstructor
@NoArgsConstructor
@IdClass(JobSkillId.class)
public class JobSkill {
    @Column(name = "more_infos",length = 1000)
    private String moreInfos;
    @Column(name = "skill_level")
    private SkillLevel skillLevel;
    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "job_id")
    private Job job;
    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "skill_id")
    private Skill skill;

    public JobSkill(String moreInfos, SkillLevel skillLevel, Skill skill) {
        this.moreInfos = moreInfos;
        this.skillLevel = skillLevel;
        this.skill = skill;
    }
}
