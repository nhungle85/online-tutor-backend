package com.nle.tutorbackend.courseservices.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nle.tutorbackend.courseservices.model.Course;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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
    @Size(min = 1, message = "Name should has at least 1 character")
    private String name;
    @Max(value = 5, message = "rating is between 0 and 5")
    @Min(value = 0, message = "rating is between 0 and 5")
    private int rating;

    public Course toModel() {
        return Course.builder().name(this.name)
                .rating(this.rating)
                .build();
    }
}
