package com.nle.tutorbackend.courseservices.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
public class ErrorResponse {
    private String message;
    private String details;
    private LocalDateTime timestamp;
}
