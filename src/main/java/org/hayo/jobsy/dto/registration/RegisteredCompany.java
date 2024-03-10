package org.hayo.jobsy.dto.registration;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisteredCompany {
    private String name;
    private String companyEmail;
    private String registrationNumber;
    private String companyWebsiteUrl;
    private String companyPhoneNumber;
    private String industry;
    private String location;
}
