package com.backend.fundamentals.app;

import com.backend.fundamentals.exception.StudentNotFoundException;
import com.backend.fundamentals.model.Student;
import com.backend.fundamentals.service.StudentService;


public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        studentService.addStudent(new Student(1, "Alex", 11));
        studentService.addStudent(new Student(2, "Jordan", 12));

        System.out.println("All students:");
        studentService.getAllStudents().forEach(System.out::println);

        System.out.println("\nUpdating student 2:");
        studentService.updateStudent(2, "Alex", 11);

        System.out.println("\nDeleting student 1");
        studentService.deleteStudent(1);

        System.out.println("\nremaing students:");
        studentService.getAllStudents().forEach(System.out::println);

        System.out.println("Trying to fetch students");
        try{
            studentService.getStudentById(99);
            }catch (StudentNotFoundException ex){
            System.out.println("Error: student not found "+ ex.getMessage());
        }
    }
}

