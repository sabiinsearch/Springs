package com.example.springboot2mySQL_example.dao;


import org.springframework.stereotype.Repository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot2mySQL_example.model.Student;

@Repository 
public interface StudentRepo extends JpaRepository<Student, Long>
{
   /*Custom Query method to search*/	
   public Student findByIndgNameAndContactNo(String name, String no);
   
}



