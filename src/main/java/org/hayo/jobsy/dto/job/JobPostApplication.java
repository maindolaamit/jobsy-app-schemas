package org.hayo.jobsy.dto.job;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JobPostApplication {
    private String id;
    @NotNull(message = "Job post id is required")
    private String jobPostId;
    @NotNull(message = "User id is required")
    private String userId;
    @NotNull(message = "Company id is required")
    private String companyId;
    private String resumeUrl;
    private String applicationStatus;
    private String applicationDate;
    private String applicationStatusBy;
    private String applicationStatusReason;
}
