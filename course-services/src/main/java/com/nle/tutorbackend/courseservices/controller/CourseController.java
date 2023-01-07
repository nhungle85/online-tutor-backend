package com.nle.tutorbackend.courseservices.controller;

import com.nle.tutorbackend.courseservices.dto.CourseRequest;
import com.nle.tutorbackend.courseservices.dto.CourseResponse;
import com.nle.tutorbackend.courseservices.service.CourseService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/courses")
@Data
@AllArgsConstructor
public class CourseController {

    private CourseService service;

    @GetMapping(path="/name")
    public String getControllerName() {
        return this.toString();
    }

    @GetMapping(path = "/{id}")
    public CourseResponse getCourseById(@PathVariable long id) {
        return CourseResponse.fromModel(service.getById(id));
    }

    @PostMapping(path = "/createCourse")
    public CourseResponse createCourse(@Valid @RequestBody CourseRequest request) {
        return CourseResponse.fromModel(service.save(request.toModel()));
    }
}
