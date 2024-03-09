package org.hayo.jobsy.dto;

import org.hayo.jobsy.dto.response.ApiErrorCauses;
import org.hayo.jobsy.dto.response.ApiErrorSchema;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ApiErrorSchemaTest {
    private ApiErrorSchema apiErrorSchema;

    @BeforeEach
    void setUp() {
        apiErrorSchema = ApiErrorSchema.builder()
                .type("Error")
                .detail("Detail")
                .causes(Arrays.asList(
                        ApiErrorCauses.builder()
                                .type("Type")
                                .detail("Detail")
                                .location("Location")
                                .name("Name")
                                .value("Value")
                                .build()
                ))
                .build();
    }

    @Test
    void testGetType() {
        assertEquals("Error", apiErrorSchema.getType());
    }

    @Test
    void testGetDetail() {
        assertEquals("Detail", apiErrorSchema.getDetail());
    }

    @Test
    void testGetCauses() {
        assertEquals(1, apiErrorSchema.getCauses().size());
        ApiErrorCauses cause = apiErrorSchema.getCauses().get(0);
        assertEquals("Type", cause.getType());
        assertEquals("Detail", cause.getDetail());
        assertEquals("Location", cause.getLocation());
        assertEquals("Name", cause.getName());
        assertEquals("Value", cause.getValue());
    }
}