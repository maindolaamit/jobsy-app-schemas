package org.hayo.jobsy.models.exceptions;

import org.hayo.jobsy.dto.response.ApiErrorCauses;
import org.hayo.jobsy.dto.response.ApiErrorSchema;

import java.util.List;

public class ExceptionUtility {
    public static ApiErrorSchema getApiErrorSchema(AbstractWebExceptions e) {
        String type = Object.class.getSimpleName();
        List<ApiErrorCauses> causes = List.of(
                ApiErrorCauses.builder().type(type)
                        .detail(e.getMessage()).build()
        );
        return ApiErrorSchema.builder()
                .type(e.getStatus().toString())
                .detail(e.getReason())
                .causes(causes).build();
    }

}
