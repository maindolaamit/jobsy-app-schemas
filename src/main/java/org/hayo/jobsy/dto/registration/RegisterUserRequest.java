package org.hayo.jobsy.dto.registration;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterUserRequest {
    @NotNull
    @NotBlank(message = "Name is required")
    @Min(5)
    private String name;
    @NotNull
    @NotBlank(message = "Email is required")
    @Email
    private String email;
    @NotNull
    @NotBlank(message = "Password is required")
    private String password;
    private String githubUrl;
    private String googleUrl;
}
