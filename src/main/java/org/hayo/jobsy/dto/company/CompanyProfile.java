package org.hayo.jobsy.dto.company;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@Data
@Builder
@NoArgsConstructor
public class CompanyProfile {
    private Long id;
    private String name;
    private String description;
    private String email;
    private String phone;
    private Integer numberOfEmployees;
    private String companyLogoUrl;
    private String companyWebsite;
    private String status;
    private List<Office> offices;
}
