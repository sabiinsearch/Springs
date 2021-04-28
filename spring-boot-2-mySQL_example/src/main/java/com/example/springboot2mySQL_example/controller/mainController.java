package com.example.springboot2mySQL_example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class mainController {

    @RequestMapping ("/addStudent")
    public String addStudent(@RequestBody Student stud) {
        
        return "welcome";
    }

}