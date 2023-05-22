package com.example.springbootdemoapplication4;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class MainController {
    @GetMapping("/register")
    public String showFrom(Model model){
     User usr = new User();
     model.addAttribute("user",usr);
        List<String> listMeslek= Arrays.asList("Developer","Tester","Lawyer","Doctor");
    model.addAttribute("listMeslek",listMeslek);
        return "registerform";

    }
    @PostMapping("/register")
    public String submitForm(@ModelAttribute("user")User usr)
    {
        System.out.println(usr);

        return "registerSuccess";
    }

}
