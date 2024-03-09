package org.hayo.jobsy.dto.users;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hayo.jobsy.dto.Address;
import org.hayo.jobsy.dto.users.Education;
import org.hayo.jobsy.dto.users.Experience;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserProfile {
    private String id;
    private String name;
    private String headline;
    private String email;
    private String phone;
    private String openToWork;
    private String resumeUrl;
    private String githubUrl;
    private String googleUrl;
    private Address address;
    private String currentPosition;
    private List<String> skills;
    private List<Education> educations;
    private List<Experience> experiences;

}
