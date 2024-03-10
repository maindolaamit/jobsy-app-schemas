package org.hayo.jobsy.dto.company;

import jakarta.validation.constraints.Email;
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
public class CreateCompanyRequest {
    private String id;
    @NotBlank(message = "Company name is required")
    @NotNull(message = "Company name is required")
    private String name;
    @NotBlank(message = "Company Registration Number is required")
    @NotNull(message = "Company Registration Number is required")
    private String registrationNumber;
    private String description;
    @NotBlank(message = "Email is required")
    @NotNull(message = "Email is required")
    @Email
    private String companyEmail;
    private String companyWebsiteUrl;
    private String companyHeadline;
    private String companyDescription;
    private String companyPhoneNumber;
    private String companyImageLogoUrl;
    private String location;
    private String industry;
    private String companySize;
}
