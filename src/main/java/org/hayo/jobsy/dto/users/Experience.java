package org.hayo.jobsy.dto.users;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hayo.jobsy.dto.Address;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Experience {
    private String company;
    private String title;
    private String description;
    private Address location;
    private String type;
    private LocalDate fromYear;
    private LocalDate toYear;
    private Integer timePeriod;
}
