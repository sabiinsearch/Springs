package com.example.springboot2mySQL_example.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.springboot2mySQL_example.service.MyServiceI;
import com.example.springboot2mySQL_example.model.Student; 

//import static java.util.Objects.isNull; // to check if Object isEmpty

@Controller
@RequestMapping ("/student")
public class mainController {
    @Autowired
    MyServiceI student_service;

    @PostMapping (value="/add", consumes = "application/json", produces = "application/json")
    public String addStudent(@RequestBody Student stud) { 
         System.out.println("From Controller");
         return student_service.saveStd(stud);
    }

    @PostMapping(
        value="/searchStudent", consumes = "application/json", produces = "application/json")
       public ModelAndView searchStd(@RequestBody Search idy) {
                 
           Student std = std_service.searchStd(idy);
           ModelAndView mv = new ModelAndView("search");
           mv.addObject("obj", std);
           return mv;
       }
    

}