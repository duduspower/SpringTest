package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class studentService {
    public List<student> getStudents(){
        return List.of(new student(
                1L,
                "Dominik",
                LocalDate.of(2003, Month.FEBRUARY, 19),
                18,
                "dominikduda191@gmail.com"));
    }
}
