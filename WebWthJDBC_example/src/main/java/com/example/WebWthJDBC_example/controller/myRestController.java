package com.example.WebWthJDBC_example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.example.WebWthJDBC_example.service.StudentJdbcService;
import com.example.WebWthJDBC_example.model.Student;

// @Component
@RestController
public class myRestController {
  
    @Autowired
    StudentJdbcService std_service;

    @RequestMapping("/saveStudent")
    public ModelAndView insideHome(Student std) {
        
        String status = std_service.saveStd(std);
        ModelAndView mv = new ModelAndView("after");
	    mv.addObject("obj", std);        
		return mv; 
    }
     
    @RequestMapping("/searchStudent")
    public ModelAndView searchStd() {
        //Student std = std_service.searchStd(@RequestParam name="id");
        String id = (@RequestParam ("id"));
        //std_service.searchStd("101");
        ModelAndView mv = new ModelAndView("search");
        mv.addObject("obj", id);
        return mv;
    }
    
}

