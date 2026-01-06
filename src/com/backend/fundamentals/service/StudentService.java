package com.backend.fundamentals.service;

import com.backend.fundamentals.model.Student;

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

    public Optional<Student> getStudentById(int id) {
        return students.stream().filter(student -> student.getId() == id).findFirst();

    }


}
