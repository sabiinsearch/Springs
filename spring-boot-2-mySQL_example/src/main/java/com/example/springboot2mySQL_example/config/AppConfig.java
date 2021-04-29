package com.example.springboot2mySQL_example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.springboot2mySQL_example.service.MyServiceI;
import com.example.springboot2mySQL_example.service.MyServiceImp;

@Configuration
  public class AppConfig {
  @Bean
  MyServiceI student_sevice()
  {
     return new MyServiceImp(); 
  }
}