package com.samajik.webapp.samajikwebapp.index;

import com.samajik.webapp.samajikwebapp.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/")
    public String index(HttpServletRequest request, Model model) {
        String name = request.getParameter("name");
        if (name == null)
            name = "Samajik College";
        model.addAttribute("name", "Rajan Paneru");
        model.addAttribute("from", name);
        return "login";
    }

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        model.addAttribute("allUsers", userRepository.findAll());
        return "index";
    }
}
