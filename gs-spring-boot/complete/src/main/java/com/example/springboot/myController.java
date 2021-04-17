package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/mine")
public class myController {

	@RequestMapping("/first")
	public String first() {
		return "my first";
	}
    
	@RequestMapping("/second")
	public String sencond(){
		return "my Second";
	}
}
