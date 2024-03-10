package org.hayo.jobsy.dto.response;

import lombok.*;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class ApiErrorCauses {
    private String type;
    private String detail;
    private String location;
    private String name;
    private String value;
}
