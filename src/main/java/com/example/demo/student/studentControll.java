package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class studentControll {

    private final studentService StudentService;

    @Autowired
    public studentControll(studentService StudentService){
        this.StudentService = StudentService;
    }

    @GetMapping
    public List<student> getStudents(){
        return StudentService.getStudents();
    }
}
