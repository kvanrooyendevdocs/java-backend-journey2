package com.backend.fundamentals.service.api;

import com.backend.fundamentals.model.Student;

import java.util.List;

//what the system does
public interface StudentService {

    void addStudent(Student student);

    List<Student> getAllStudents();

    Student getStudentById(int id);
    void updateStudent(int id, String newName, int newGrade);

    void deleteStudent(int id);
}
