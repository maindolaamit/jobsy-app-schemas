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
public class RegisterCompanyRequest {
    @NotBlank
    @Size(min = 5, message = "Name must be at least 5 characters")
    private String name;
    @NotBlank(message = "Company Registration Number is required")
    @NotNull(message = "Company Registration Number is required")
    private String registrationNumber;
    @NotNull
    @NotBlank(message = "Email is required")
    @Email
    private String companyEmail;
    @NotNull
    @NotBlank(message = "Password is required")
    private String password;
    @NotNull
    @NotBlank(message = "Phone is required")
    private String companyPhoneNumber;
    @NotNull
    @NotBlank(message = "Industry is required")
    private String Industry;
    private String location;
}
