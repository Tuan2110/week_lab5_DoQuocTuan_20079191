package vn.edu.iuh.fit.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.edu.iuh.fit.models.EmailDetails;
import vn.edu.iuh.fit.services.EmailService;

@Controller
@RequestMapping("email")
public class EmailController {

    @Autowired
    private EmailService emailService;
    @PostMapping("/send")
    public String sendMail(HttpServletRequest request)
    {
        String recipient = request.getParameter("recipient");
        String subject = request.getParameter("subject");
        String content = request.getParameter("msgBody");
        EmailDetails details = new EmailDetails();
        details.setRecipient(recipient);
        details.setSubject(subject);
        details.setMsgBody(content);
        emailService.sendSimpleMail(details);
        return "components/notification";
    }
}
