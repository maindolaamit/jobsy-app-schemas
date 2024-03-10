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
public class RegisterUserRequest {
    @NotNull(message = "Name is required")
    @NotBlank(message = "Name is required")
    @Size(min = 5, message = "Name must be at least 5 characters")
    private String name;
    @NotNull(message = "Email is required")
    @NotBlank(message = "Email is required")
    @Email
    private String email;
    @NotNull(message = "Password is required")
    @NotBlank(message = "Password is required")
    private String password;
    private String githubUrl;
    private String googleUrl;
}
