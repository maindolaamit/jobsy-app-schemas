package org.hayo.jobsy.dto.registration;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterUserRequest {
    private String name;
    private String email;
    private String password;
    private String githubUrl;
    private String googleUrl;
}
