package com.backend.fundamentals.app;

import com.backend.fundamentals.model.Student;
import com.backend.fundamentals.service.api.StudentService;
import com.backend.fundamentals.service.impl.InMemoryStudentService;

public class Main {

    public static void main(String[] args) {

        StudentService studentService = new InMemoryStudentService();

        studentService.addStudent(new Student(1, "Alex", 11));
        studentService.addStudent(new Student(2, "Jordan", 12));

        System.out.println("All students:");
        studentService.getAllStudents().forEach(System.out::println);

        studentService.updateStudent(2, "Jordan Smith", 12);
        studentService.deleteStudent(1);

        System.out.println("\nRemaining students:");
        studentService.getAllStudents().forEach(System.out::println);
    }
}
