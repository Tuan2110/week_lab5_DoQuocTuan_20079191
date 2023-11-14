package vn.edu.iuh.fit.controllers;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vn.edu.iuh.fit.models.Company;
import vn.edu.iuh.fit.services.CompanyService;

@Controller
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    private CompanyService companyService;
    @GetMapping("/login")
    public String login(){
        return "company/login";
    }
    @PostMapping("/login")
    public String login(Model model, HttpServletRequest request, @RequestParam String email, @RequestParam String password){
        HttpSession session = request.getSession();
        Company company = companyService.findByEmailAndPassword(email,password);
        session.setAttribute("company",company);
        return "company/home";
    }
}
