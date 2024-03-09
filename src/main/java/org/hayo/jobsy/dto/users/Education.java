package org.hayo.jobsy.dto.users;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Education {
    private String university;
    private String degree;
    private LocalDate fromYear;
    private LocalDate toYear;
    private String description;
    private String major;
    private String gpa;
}
