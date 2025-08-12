package com.learams.demo_service.controller;

import com.learams.demo_service.model.Demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class PublicController {
    private List<Demo> students = Arrays.asList(
            new Demo(1,"Sachin Gusain",92),
            new Demo(2,"Barry Allen",93),
            new Demo(3,"John Cena",94)
            );
    @GetMapping("/students")
    public List<Demo> getStudents(){
        return students;
    }
}
