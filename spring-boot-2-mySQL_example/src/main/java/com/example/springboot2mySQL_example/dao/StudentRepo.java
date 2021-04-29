package com.example.springboot2mySQL_example.dao;


import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import com.example.springboot2mySQL_example.model.Student;

@Repository 
public interface StudentRepo extends CrudRepository<Student, Long>
{
   /*Custom Query method to search*/	
   public Student findByIndgNameAndContactNo(String name, String no);
   
}



