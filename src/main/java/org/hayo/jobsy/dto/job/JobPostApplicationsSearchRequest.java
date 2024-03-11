package org.hayo.jobsy.dto.job;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hayo.jobsy.utils.validaton.AtLeastOneNotNull;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@AtLeastOneNotNull
public class JobPostApplicationsSearchRequest {
    private String jobPostId;
    private String userId;
    private String companyId;
    private String status;
    private String applicationDate;
}
