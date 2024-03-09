package org.hayo.jobsy.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class ApiErrorSchema {
    private String type;
    private String detail;
    private List<ApiErrorCauses> causes;
}
