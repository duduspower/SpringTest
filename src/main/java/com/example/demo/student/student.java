package com.example.demo.student;

import java.time.LocalDate;

public class student {
    private  Long id;
    private String name;
    private LocalDate date;
    private Integer age;
    private String email;

    public student() {
    }

    public student(Long id, String name, LocalDate date, Integer age, String email) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.age = age;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public student(String name, LocalDate date, Integer age, String email) {
        this.name = name;
        this.date = date;
        this.age = age;
        this.email = email;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
