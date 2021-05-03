package com.example.springboot2mySQL_example.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.springboot2mySQL_example.service.MyServiceI;

import com.example.springboot2mySQL_example.model.Student; 
import com.example.springboot2mySQL_example.model.Search;
import com.example.springboot2mySQL_example.model.ForUpdate;
import com.example.springboot2mySQL_example.model.ForDelete;

import java.util.*; // using List class
//import static java.util.Objects.isNull; // to check if Object isEmpty

@RestController
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
        value="/search", consumes = "application/json", produces = "application/json")
       public Student searchStd(@RequestBody Search idy) {
                 
           Student std = student_service.searchStd(idy);
        //    ModelAndView mv = new ModelAndView("search");
        //    mv.addObject("obj", std);
        //    return mv;
              return std; 
       }
    

    @PostMapping(
        value="/update", consumes = "application/json", produces = "application/json")
       public Student updateStudent(@RequestBody ForUpdate std) {
           Student updatedStd = student_service.updateStudent(std);
        //    ModelAndView mv = new ModelAndView("search");
        //    mv.addObject("obj", updatedStd);
        //    return mv;
              return updatedStd;
       }
   
       @RequestMapping(value="/get", produces = "application/json")
       public List<Student> getStudents() {
           return student_service.getStudentsFromRepo();
       }
   
       @PostMapping(
         value="/delete", consumes = "application/json")
       public void remStudent(@RequestBody ForDelete stud) {
        student_service.deleteStd(stud);
       }  

}