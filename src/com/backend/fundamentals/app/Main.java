package com.backend.fundamentals.app;

import com.backend.fundamentals.model.Student;
import com.backend.fundamentals.service.StudentService;


public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        studentService.addStudent(new Student(1, "Alex", 11));
        studentService.addStudent(new Student(2, "Jordan", 12));

        System.out.println("All students:");
        studentService.getAllStudents().forEach(System.out::println);

        System.out.println("student with id 2: ");
        studentService.getStudentById(2).ifPresentOrElse(System.out::println,
                ()-> System.out.println("student with id 2 not found"));
    }
}

