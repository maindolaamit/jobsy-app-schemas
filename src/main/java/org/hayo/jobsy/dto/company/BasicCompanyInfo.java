package org.hayo.jobsy.dto.company;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@Builder
@NoArgsConstructor
public class BasicCompanyInfo {
    String id;
    @NotBlank(message = "Company name is required")
    @NotNull(message = "Company name is required")
    String name;
    private String companyImageLogoUrl;
    private String companyWebsiteUrl;
    private String numberOfEmployees;
    private String location;
}
