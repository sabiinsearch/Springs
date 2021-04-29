package com.example.springboot2mySQL_example.service;

import org.springframework.stereotype.Service;
import com.example.springboot2mySQL_example.dao.StudentRepo;
import com.example.springboot2mySQL_example.model.Student;

@Service
public interface MyServiceI {

    public String saveStd(Student std); 
/*         
    public Student searchStd(Search search);
    
    public Student updateStudent(ForUpdate std_sent);
    

    public List<Student> getStudentsFromRepo();
   
    public void deleteStd(ForDelete stdToDelte);
*/
}
