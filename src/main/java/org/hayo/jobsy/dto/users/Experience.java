package org.hayo.jobsy.dto.users;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Experience {
    @NotNull(message = "Company name is required")
    @NotBlank(message = "Company name is required")
    private String company;
    @NotNull(message = "Title is required")
    @NotBlank(message = "Title is required")
    @Size(min = 3, message = "Title too short")
    private String title;
    private String description;
    private String location;
    private String type;
    private LocalDate fromYear;
    private LocalDate toYear;
    private Integer timePeriod;
}
