package com.nle.tutorbackend.courseservices.exception;

public class InvalidCourseCreationException extends RuntimeException{
    public InvalidCourseCreationException(String message) {
        super(message);
    }
}
