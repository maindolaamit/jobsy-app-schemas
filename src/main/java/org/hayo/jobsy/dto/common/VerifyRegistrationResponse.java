package org.hayo.jobsy.dto.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VerifyRegistrationResponse {
    private String message;
    private String profileId;
    private LocalDateTime timestamp;
}
