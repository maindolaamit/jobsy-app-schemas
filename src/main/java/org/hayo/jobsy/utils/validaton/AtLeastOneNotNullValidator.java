package org.hayo.jobsy.utils.validaton;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.hayo.jobsy.dto.job.JobPostsSearchRequest;

public class AtLeastOneNotNullValidator implements ConstraintValidator<AtLeastOneNotNull, JobPostsSearchRequest> {
    @Override
    public boolean isValid(JobPostsSearchRequest request, ConstraintValidatorContext context) {
        if (request == null) return false;

        if (request.getCompanyId() == null && request.getJobTitle() == null
                && request.getLocation() == null && request.getUserId() == null) {
            return false;
        }

        return request.getUserId().isBlank() || request.getCompanyId().isBlank()
                || !request.getJobTitle().isBlank() || request.getLocation().isBlank();
    }
}
