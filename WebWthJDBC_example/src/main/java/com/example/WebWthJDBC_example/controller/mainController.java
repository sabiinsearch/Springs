package com.example.WebWthJDBC_example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class mainController {

    @RequestMapping ("/")
    public String firstPage() {
        return "welcome";
    }

}