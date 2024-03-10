package org.hayo.jobsy.dto.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisteredEntityResponse {
    private String message;
    private String verificationUrl;
    private LocalDateTime timestamp;
}
