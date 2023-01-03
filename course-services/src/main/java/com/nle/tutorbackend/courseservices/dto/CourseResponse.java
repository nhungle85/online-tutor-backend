package com.nle.tutorbackend.courseservices.dto;

import com.nle.tutorbackend.courseservices.model.Course;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CourseResponse {
    private long id;
    private String name;
    private int rating;

    public static CourseResponse fromModel(Course course) {
        return CourseResponse.builder().id(course.getId())
                .name(course.getName())
                .rating(course.getRating())
                .build();
    }
}
