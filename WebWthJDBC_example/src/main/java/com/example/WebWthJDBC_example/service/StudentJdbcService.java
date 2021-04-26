package com.example.WebWthJDBC_example.service;

import java.util.*;
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
import com.example.WebWthJDBC_example.model.Search;

@Service
public class StudentJdbcService {

    @Autowired
    StudentRepo std_repo;
	
    public String saveStd(Student std) {  
        System.out.println("in save student of Service with student =%s"+std.toString());
        std_repo.save(std);
        return "saved";
    }
    
    public Student searchStd(Long id)
    {
      //Long id = Long.decode(s);  
      System.out.println("Got from Postman : "+id);
      System.out.println(std_repo.findById(id));
      return std_repo.findById(id).get();
     //   return "searched";
    }

    public Student updateStudent(Student stud)
    {
        Optional<Student> std_sent = std_repo.findById(stud.getId());
        if(std_sent.isPresent()) 
        {
            Student newStudent = stud;
            newStudent.setIndgName(stud.getIndgName());
            newStudent.setContactNo(stud.getContactNo());
            newStudent.setStream(stud.getStream());
            newStudent = std_repo.save(newStudent);
             
            return newStudent;
        } else {       
            return stud;
        }
    }

    public List<Student> getStudentsFromRepo() {
          return (List<Student>)std_repo.findAll();
    }
    
    public void deleteStd(Long id) {
         std_repo.deleteById(id);
    }
}

