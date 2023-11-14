package vn.edu.iuh.fit.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.edu.iuh.fit.models.Candidate;
import vn.edu.iuh.fit.models.Skill;
import vn.edu.iuh.fit.services.SkillService;

import java.util.List;

@Controller
@RequestMapping("/skill")
public class SkillController {
    @Autowired
    private SkillService skillService;
    @GetMapping("/learn")
    public String learn(HttpServletRequest request){
        Candidate candidate =(Candidate) request.getSession().getAttribute("candidate");
        List<Skill> skills = skillService.getSkillToLearn(candidate);
        request.setAttribute("skills",skills);
        return "skill/learn";
    }
}
