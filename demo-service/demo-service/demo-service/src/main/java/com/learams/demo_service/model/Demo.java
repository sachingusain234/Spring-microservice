package com.learams.demo_service.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Demo {
    private int id;
    private String name;
    private double marks;
}
