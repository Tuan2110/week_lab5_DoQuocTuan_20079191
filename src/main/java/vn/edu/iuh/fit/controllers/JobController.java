package vn.edu.iuh.fit.controllers;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vn.edu.iuh.fit.enums.SkillLevel;
import vn.edu.iuh.fit.enums.SkillType;
import vn.edu.iuh.fit.models.*;
import vn.edu.iuh.fit.services.JobService;

@Controller
@RequestMapping("/job")
public class JobController {
    @Autowired
    private JobService jobService;
    @GetMapping
    public String getJobBySkill(Model model, HttpSession session){
        Candidate candidate = (Candidate) session.getAttribute("candidate");
        model.addAttribute("jobs",jobService.getJobsBySkill(candidate));
        return "job/job";
    }
    @GetMapping("/detail/{id}")
    public String jobDetail(Model model, @PathVariable("id") Long id){
        model.addAttribute("job",jobService.findById(id));
        return "job/job-detail";
    }
    @GetMapping("/search")
    public String search(Model model, HttpServletRequest request){
        String query = (String) request.getParameter("query");
        model.addAttribute("jobs",jobService.findByQuery(query));
        return "job/job";
    }
    @GetMapping("/create")
    public String createJob(Model model){
        model.addAttribute("skillLevels", SkillLevel.values());
        model.addAttribute("skillTypes", SkillType.values());
        return "company/create-job";
    }
    @PostMapping("/create")
    public String createJob(HttpServletRequest request){
        Job job = new Job();
        String jobName = (String) request.getParameter("jobName");
        String jobDesc = (String) request.getParameter("jobDesc");
        String[] skillLevel =  request.getParameterValues("skillLevel");
        String[] moreInfos =  request.getParameterValues("moreInfos");
        String[] skillName = request.getParameterValues("skillName");
        String[] skillDesc =  request.getParameterValues("skillDesc");
        String[] skillType =  request.getParameterValues("skillType");
        Company company = (Company) request.getSession().getAttribute("company");
        job.setJobDesc(jobDesc);
        job.setJobName(jobName);
        job.setCompany(company);
        for(int i = 0; i < skillName.length; i++){
            JobSkill jobSkill = new JobSkill();
            jobSkill.setMoreInfos(moreInfos[i]);
            jobSkill.setSkillLevel(SkillLevel.valueOf(skillLevel[i]));
            jobSkill.setJob(job);
            Skill skill = new Skill();
            skill.setSkillName(skillName[i]);
            skill.setSkillDescription(skillDesc[i]);
            skill.setType(SkillType.valueOf(skillType[i]));
            jobSkill.setSkill(skill);
            job.getJobSkills().add(jobSkill);
        }
        jobService.createJob(job);
        return "components/notification";
    }
}
