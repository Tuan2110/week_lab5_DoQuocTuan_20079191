package vn.edu.iuh.fit.ids;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import vn.edu.iuh.fit.models.Job;
import vn.edu.iuh.fit.models.Skill;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class JobSkillId implements Serializable {
    private Job job;
    private Skill skill;
}
