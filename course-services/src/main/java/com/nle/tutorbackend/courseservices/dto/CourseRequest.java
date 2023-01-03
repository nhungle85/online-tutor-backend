package com.nle.tutorbackend.courseservices.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nle.tutorbackend.courseservices.model.Course;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CourseRequest {
    @JsonProperty("courseName")
    @NotNull
    private String name;
    private int rating;

    public Course toModel() {
        return Course.builder().name(this.name)
                .rating(this.rating)
                .build();
    }
}
