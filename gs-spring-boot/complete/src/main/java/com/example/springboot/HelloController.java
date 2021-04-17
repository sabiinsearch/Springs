package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "completed Greetings from Spring Boot!";
	}
    
	@RequestMapping("/check")
	public String test(){
		return "checking";
	}
}
