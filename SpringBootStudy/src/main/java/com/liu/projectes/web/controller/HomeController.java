package com.liu.projectes.web.controller;

import com.liu.projectes.base.ApiResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("name","Hongqiao");
        return "index";
    }
   @GetMapping("/404")
    public String notFoundpage(){
        return "404";
   }
   @GetMapping("/403")
    public String accesserror(){
        return "403";
   }
   @GetMapping("/500")
    public String interError(){
        return "500";
   }
    @GetMapping("/logout")
    public String logoutpage(){
        return "logout";
    }
}
