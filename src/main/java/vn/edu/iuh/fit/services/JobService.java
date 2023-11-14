package vn.edu.iuh.fit.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.models.*;
import vn.edu.iuh.fit.repositories.JobRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobRepository jobRepository;
    public List<Job> getJobsBySkill(Candidate candidate) {
        List<Job> jobs = jobRepository.findAll();
        List<Job> jobsBySkill = new ArrayList<>();
        for(CandidateSkill candidateSkill: candidate.getCandidateSkills()){
            Skill skill = candidateSkill.getSkill();
            for(Job job: jobs){
                for (JobSkill jobSkill : job.getJobSkills()){
                    if (jobSkill.getSkill().getSkillName().contains(skill.getSkillName())){
                        jobsBySkill.add(job);
                    }
                }
            }
        }
        return jobsBySkill;
    }
    public Job findById(Long id) {
        return jobRepository.findById(id).orElse(null);
    }
    public List<Job> findByQuery(String query){
        return jobRepository.findByQuery(query);
    }

    public void createJob(Job job) {
        jobRepository.save(job);
    }
}
