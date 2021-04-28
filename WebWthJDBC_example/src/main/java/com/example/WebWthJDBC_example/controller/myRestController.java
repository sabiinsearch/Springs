package com.example.WebWthJDBC_example.controller;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.example.WebWthJDBC_example.service.StudentJdbcService;
import com.example.WebWthJDBC_example.model.Student;
import com.example.WebWthJDBC_example.model.Search;
import com.example.WebWthJDBC_example.model.ForUpdate;
import com.example.WebWthJDBC_example.model.ForDelete;

@RestController
public class myRestController {
  
    @Autowired
    StudentJdbcService std_service;

    @PostMapping(value="/saveStudent", consumes = "application/json", produces = "application/json")
    public ModelAndView insideHome(@RequestBody Student std) {        
        String status = std_service.saveStd(std);
        ModelAndView mv = new ModelAndView("after");
	    mv.addObject("obj", std);        
		return mv; 
    }
    
    
    @PostMapping(
     value="/searchStudent", consumes = "application/json", produces = "application/json")
    public ModelAndView searchStd(@RequestBody Search idy) {
              
        Student std = std_service.searchStd(idy);
        ModelAndView mv = new ModelAndView("search");
        mv.addObject("obj", std);
        return mv;
    }
 
    @PostMapping(
     value="/updateStudent", consumes = "application/json", produces = "application/json")
    public ModelAndView updateStudent(@RequestBody ForUpdate std) {
        Student updatedStd = std_service.updateStudent(std);
        ModelAndView mv = new ModelAndView("search");
        mv.addObject("obj", updatedStd);
        return mv;
    }

    @RequestMapping(value="/getStudents", produces = "application/json")
    public List<Student> getStudents() {
        return std_service.getStudentsFromRepo();
    }

    @PostMapping(
      value="/deleteStudent", consumes = "application/json")
    public void remStudent(@RequestBody ForDelete stud) {
        std_service.deleteStd(stud);
    }      
    
}

