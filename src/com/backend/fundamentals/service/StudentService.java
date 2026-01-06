package com.backend.fundamentals.service;

import com.backend.fundamentals.model.Student;
import  com.backend.fundamentals.exception.StudentNotFoundException;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentService {
    private final List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);

    }

    public List<Student> getAllStudents() {
        return new ArrayList<>(students);
    }

    public Student getStudentById(int id) {
        return students.stream().filter(student -> student.getId() == id).
                findFirst().orElseThrow(()-> new StudentNotFoundException(id));
    }

    public void updateStudent(int id, String newName, int newGrade) {

        Student student = getStudentById(id);
        students.remove(student);
        students.add(new Student(id, newName, newGrade));
    }

    public void deleteStudent(int id) {
        Student student = getStudentById(id);
        students.remove(student);
    }


}
