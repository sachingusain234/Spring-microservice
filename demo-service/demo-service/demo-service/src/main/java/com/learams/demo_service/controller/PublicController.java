package com.learams.demo_service.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learams.demo_service.model.Demo;

@RestController
@RequestMapping("/api")
public class PublicController {
    private List<Demo> students = Arrays.asList(
            new Demo(1,"Geralt Rivia",92),
            new Demo(2,"Barry Allen",93),
            new Demo(3,"John Cena",94)
            );
    @GetMapping("/students")
    public List<Demo> getStudents(){
        return students;
    }
}
