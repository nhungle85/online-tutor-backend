package com.nle.tutorbackend.courseservices.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="COURSE")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Course {
    @Id
    @Column(name = "Course_Id")
    @GeneratedValue
    private long id;

    @NotNull
    private String name;
    private int rating;
}
