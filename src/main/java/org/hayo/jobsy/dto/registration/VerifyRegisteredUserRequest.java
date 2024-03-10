package org.hayo.jobsy.dto.registration;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VerifyRegisteredUserRequest {
    @NotNull(message = "Email can not be null")
    @NotBlank(message = "Email is required")
    @Email
    private String email;
    @NotNull(message = "Token is required")
    @NotBlank(message = "Token is required")
    @Size(min = 6, max = 8, message = "Token too short or too long")
    private String token;
}
