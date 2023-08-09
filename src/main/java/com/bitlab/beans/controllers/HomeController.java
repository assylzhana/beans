package com.bitlab.beans.controllers;

import com.bitlab.beans.config.DBUtil;
import com.bitlab.beans.models.Test;
import com.bitlab.beans.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {

    @Autowired
    private TaskService taskService;
    @Autowired
    private DBUtil dbUtil; 

    @GetMapping("/")
    public String homePage(Model model){
        model.addAttribute("a", taskService.getTests() );

        return "home";
    }
    @GetMapping("/details/{id}")
    public String details(@PathVariable Long id, Model model){
        model.addAttribute("a", taskService.details(id));
        return "details";
    }
}
