package org.hayo.jobsy.dto.users;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Salary {
    private String currency;
    private Integer amount;
    private Integer min;
    private Integer max;
}
