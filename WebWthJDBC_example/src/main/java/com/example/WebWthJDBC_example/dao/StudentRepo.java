package com.example.WebWthJDBC_example.dao;

//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RestController;
import java.util.*;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import com.example.WebWthJDBC_example.model.Student;

 
//import com.example.WebWthJDBC_example.model.Laptop;

@Repository 
public interface StudentRepo extends CrudRepository<Student, Long>
{
   /*Custom Query method to search*/	
   public Student findByIndgNameAndContactNo(String name, String no);
   
}

