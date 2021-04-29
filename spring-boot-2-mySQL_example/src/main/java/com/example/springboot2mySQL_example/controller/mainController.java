package com.example.springboot2mySQL_example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.springboot2mySQL_example.service.MyServiceI;
import com.example.springboot2mySQL_example.model.Student; 

@Controller
@RequestMapping ("/Student")
public class mainController {
  //  @Autowired
    MyServiceI student_sevice;

    @PostMapping ("/add")
    public String addStudent(@RequestBody Student stud) {   
       return student_sevice.saveStd(stud);
    }

}