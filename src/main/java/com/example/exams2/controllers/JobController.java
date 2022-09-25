package com.example.exams2.controllers;

import com.example.exams2.RRCs.JobPostModel;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobController {

    @RequestMapping(value = {"/home","/"}, produces = MediaType.APPLICATION_JSON_VALUE)
    public String hello(){
        JobPostModel jobPostModel = new JobPostModel();
        jobPostModel.setId(0123);
        jobPostModel.setPrice(10);
        jobPostModel.setEmployerId(123456);
        jobPostModel.setTitle("First one");
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json;
        try {
            json = ow.writeValueAsString(jobPostModel);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return json;
    }

}
