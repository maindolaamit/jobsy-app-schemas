package org.hayo.jobsy.dto.job;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JobPostApplicationStatusRequest {
    @NotBlank(message = "Application id is required")
    private String applicationId;
    @NotBlank(message = "New Status is required")
    private String status;
    private String reason;
    @NotBlank
    private String updatedBy;
}
