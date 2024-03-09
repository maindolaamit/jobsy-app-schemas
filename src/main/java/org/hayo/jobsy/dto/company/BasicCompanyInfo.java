package org.hayo.jobsy.dto.company;

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
    String name;
    String companyLogoUrl;
    String companyWebsite;
    String numberOfEmployees;
    String location;
}
