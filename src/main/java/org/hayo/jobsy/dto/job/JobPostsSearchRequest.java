package org.hayo.jobsy.dto.job;

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
public class JobPostsSearchRequest {
    String companyId;
    String jobTitle;
    String jobType;
    String location;
    String jobStatus;
    String userId;
}
