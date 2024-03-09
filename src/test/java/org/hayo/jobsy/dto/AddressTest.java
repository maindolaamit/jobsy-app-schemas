package org.hayo.jobsy.dto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddressTest {
    private Address address;

    @BeforeEach
    void setUp() {
        address = Address.builder()
                .street("123 Main St")
                .city("Anytown")
                .state("CA")
                .country("USA")
                .zip("12345")
                .build();
    }

    @Test
    @DisplayName("Test toLocation()")
    void testToLocation() {
        assertEquals("123 Main St, Anytown, CA, USA, 12345", address.toLocation());
    }

    @Test
    @DisplayName("Test getters and setters")
    void testGettersAndSetters() {
        address.setStreet("456 Other St");
        assertEquals("456 Other St", address.getStreet());

        address.setCity("Othercity");
        assertEquals("Othercity", address.getCity());

        address.setState("NY");
        assertEquals("NY", address.getState());

        address.setCountry("Canada");
        assertEquals("Canada", address.getCountry());

        address.setZip("67890");
        assertEquals("67890", address.getZip());
    }
}