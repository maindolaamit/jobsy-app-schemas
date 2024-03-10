package org.hayo.jobsy.dto.registration;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VerifyRegisteredCompanyRequest {
    @NotNull(message = "Registration number can not be null")
    @NotBlank(message = "Registration number is required")
    private String registrationNumber;
    @NotNull(message = "Token is required")
    @NotBlank(message = "Token is required")
    @Size(min = 6, max = 8, message = "Token too short or too long")
    private String token;
}
