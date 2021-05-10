package com.example.WebWthJDBC_example.service;

import java.util.*;
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
import com.example.WebWthJDBC_example.model.ForUpdate;
import com.example.WebWthJDBC_example.model.ForDelete;
import static java.util.Objects.isNull; // to check if Object isEmpty


@Service
public class StudentJdbcService {

    @Autowired
    StudentRepo std_repo;
	

    public String saveStd(Student std) { 
        String msg; 
        Student std_sent = std_repo.findByIndgNameAndContactNo(std.getIndgName(), std.getContactNo());
        if(isNull(std_sent)) {            
            std_repo.save(std);
            msg = "Saving as New Student"+std_sent;
        } else {
            System.out.println("Duplicate student kindly update");
            msg = "Duplicate student, Hence only update is permitted \n";
        }
         
        return msg;
    }
    
    public Student searchStd(Search search)
    {
      System.out.println(std_repo.findByIndgNameAndContactNo(search.getIndgName(), search.getContactNo()));
      return std_repo.findByIndgNameAndContactNo(search.getIndgName(), search.getContactNo());
    }

    public Student updateStudent(ForUpdate std_sent)
    {

        System.out.println("Student sent is "+std_sent); 
        Student stdForUpdate = std_repo.findByIndgNameAndContactNo(std_sent.getIndgName(), std_sent.getContactNo());
        System.out.println("Student to update is "+stdForUpdate); 
        if(isNull(stdForUpdate)) {  
            System.out.println("Adding as new Std");
        }else { 
            System.out.println("Updating the old Std with "+std_sent.getStream());
        }
            stdForUpdate.setIndgName(std_sent.getIndgName());
            stdForUpdate.setStream(std_sent.getStream());
            stdForUpdate.setContactNo(std_sent.getContactNo());
            std_repo.save(stdForUpdate); 
               
            return stdForUpdate;

    }

    public List<Student> getStudentsFromRepo() {
          return (List<Student>)std_repo.findAll();
    }
    
    public void deleteStd(ForDelete stdToDelte) {
         Student stdForDeletion = std_repo.findByIndgNameAndContactNo(stdToDelte.getIndgName(), stdToDelte.getContactNo());
         std_repo.delete(stdForDeletion);
         System.out.println("Deleted Student : "+stdForDeletion);
         
    }
}

