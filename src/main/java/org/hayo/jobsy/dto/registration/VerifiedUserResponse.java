package org.hayo.jobsy.dto.registration;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VerifiedUserResponse {
    private String message;
    private String userProfileUrl;
    private LocalDateTime timestamp;
}
