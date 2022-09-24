package com.example.exams.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobController {

    @RequestMapping({"/home","/"})
    public String hello(){
        return "hello";
    }

}
