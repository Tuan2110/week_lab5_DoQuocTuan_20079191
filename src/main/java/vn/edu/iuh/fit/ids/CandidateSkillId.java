package vn.edu.iuh.fit.ids;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import vn.edu.iuh.fit.models.Candidate;
import vn.edu.iuh.fit.models.Skill;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class CandidateSkillId implements Serializable {
    private Candidate candidate;
    private Skill skill;
}
