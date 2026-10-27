package com.example.studentmanagement;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "My first Spring Boot API is working!";
    }

    @GetMapping("/student")
    public Student getStudent() {
        return new Student(1, "Rahul", 95);
    }

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return List.of(
            new Student(1, "Rahul", 95),
            new Student(2, "Priya", 88)
        );
    }
}