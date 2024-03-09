package org.hayo.jobsy.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class ApiErrorCauses {
    private String type;
    private String detail;
    private String location;
    private String name;
    private String value;
}
