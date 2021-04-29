package com.example.springboot2mySQL_example.service;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.springboot2mySQL_example.service.MyServiceI;
import com.example.springboot2mySQL_example.dao.StudentRepo;

import com.example.springboot2mySQL_example.model.Student;
  
import static java.util.Objects.isNull;  // to check if Object isEmpty


@Component
public class MyServiceImp implements MyServiceI {

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
 /* 
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
 */
}

