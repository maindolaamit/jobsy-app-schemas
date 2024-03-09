package org.hayo.jobsy.dto.job;

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
public class JobStatusUpdateRequest {
    @NotNull(message = "Job id is required")
    @NotBlank(message = "Job id is required")
    private String jobId;
    @NotNull(message = "Status is required")
    @NotBlank(message = "Status is required")
    private String status;
    private String updatedBy;
    private String statusReason;
}
