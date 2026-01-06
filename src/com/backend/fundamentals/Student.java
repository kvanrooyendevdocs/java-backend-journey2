package com.backend.fundamentals;

public class Student {

    private final int id;
    private final String name;
    private final int grade;

    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student {id=" + getId() + ", name=" + getName() + ", grade=" + getGrade() + "}";
    }

}
