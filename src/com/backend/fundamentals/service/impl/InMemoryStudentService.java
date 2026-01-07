//how the system does it

package com.backend.fundamentals.service.impl;

import com.backend.fundamentals.model.Student;
import  com.backend.fundamentals.exception.StudentNotFoundException;
import com.backend.fundamentals.service.api.StudentService;

import java.util.ArrayList;
import java.util.List;

public class InMemoryStudentService implements StudentService {

    private final List<Student> students = new ArrayList<>();

    @Override
    public void addStudent(Student student) {
        students.add(student);

    }

    @Override
    public List<Student> getAllStudents() {
        return new ArrayList<>(students);
    }

    @Override
    public Student getStudentById(int id) {
        return students.stream().filter(student -> student.getId() == id).
                findFirst().orElseThrow(()-> new StudentNotFoundException(id));
    }

    @Override
    public void updateStudent(int id, String newName, int newGrade) {

        Student student = getStudentById(id);
        students.remove(student);
        students.add(new Student(id, newName, newGrade));
    }

    @Override
    public void deleteStudent(int id) {
        Student student = getStudentById(id);
        students.remove(student);
    }


}
