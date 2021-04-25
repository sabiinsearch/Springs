package com.example.WebWthJDBC_example.service;

import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
import com.example.WebWthJDBC_example.dao.StudentRepo;
import com.example.WebWthJDBC_example.model.Student;


@Service
public class StudentJdbcService {

    @Autowired
    StudentRepo std_repo;
	
    public String saveStd(Student std) {  
        System.out.println("in save student of Service");
        std_repo.save(std);
        return "saved";
    }
    
    public Student searchStd(String s)
    {
      Long id = Long.parseLong(s);  
      System.out.println(std_repo.findById(id));
      return std_repo.findById(id).get();
    }
}

