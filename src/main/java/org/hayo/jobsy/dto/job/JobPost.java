package org.hayo.jobsy.dto.job;

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
public class JobPost {
    private String id;
    @NotBlank(message = "Job type is required")
    private String jobType;
    @NotBlank(message = "Job title is required")
    @Size(min = 3, max = 100, message = "Job title must be between 3 and 100 characters")
    private String jobTitle;
    @NotBlank(message = "About job is required")
    @Size(min = 10, max = 1000, message = "About job must be between 10 and 1000 characters")
    private String aboutJob;
    @NotNull(message = "Company id is required")
    @NotBlank(message = "Company id is required")
    private String companyId;
    private String location;
    private String skills;
    private String status;
}
