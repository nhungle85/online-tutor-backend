package com.nle.tutorbackend.courseservices.service;

import com.nle.tutorbackend.courseservices.model.Course;
import com.nle.tutorbackend.courseservices.repository.CourseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CourseService {
    private CourseRepository repository;

    public Iterable<Course> getAllCourse() {
        return repository.findAll();
    }

    public Course getById(long id) {
        return repository.findById(id).orElse(new Course());
    }

    public Course save(Course course) {
        return repository.save(course);
    }
}
