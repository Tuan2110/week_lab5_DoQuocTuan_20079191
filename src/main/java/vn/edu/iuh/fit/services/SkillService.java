package vn.edu.iuh.fit.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.models.Candidate;
import vn.edu.iuh.fit.models.CandidateSkill;
import vn.edu.iuh.fit.models.Skill;
import vn.edu.iuh.fit.repositories.SkillRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class SkillService {
    @Autowired
    private SkillRepository skillRepository;
    public List<Skill> getSkillToLearn(Candidate candidate){
        List<Skill> skills = skillRepository.findAll();
        List<CandidateSkill> skillsOfCan = candidate.getCandidateSkills();
        List<Skill> skillToLearn = new ArrayList<>();
        for(Skill skill:skills){
            boolean isExist = false;
            for(CandidateSkill candidateSkill:skillsOfCan){
                if(skill.getSkillName().contains(candidateSkill.getSkill().getSkillName())){
                    isExist = true;
                    break;
                }
            }
            if(!isExist){
                skillToLearn.add(skill);
            }
        }
        return skillToLearn;
    }
}
