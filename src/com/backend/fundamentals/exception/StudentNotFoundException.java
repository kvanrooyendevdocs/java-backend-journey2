package com.backend.fundamentals.exception;


//In backend apps, missing data is a logic error, not a compile-time problem
//so we use runtime exceptions as this is what Spring uses

public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(int id) {
        super("Student with id " + id + " not found");
    }

}
