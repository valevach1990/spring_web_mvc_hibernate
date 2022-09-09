package com.valevach.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("/menu")
    public String showMainMenu(){
        return "mainMenu";
    }

    @RequestMapping("/showAllEmps")
    public String showAllEmployees(){
        return "showAllInfo/showAllEmployees";
    }

    @RequestMapping("/showAllDetails")
    public String showAllDetails(){
        return "showAllInfo/showAllDetails";
    }

    @RequestMapping("/showAllPositions")
    public String showAllPositions(){
        return "showAllInfo/showAllPositions";
    }

    @RequestMapping("/showAllProjects")
    public String showAllProjects(){
        return "showAllInfo/showAllProjects";
    }
}
