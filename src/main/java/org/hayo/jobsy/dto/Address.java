package org.hayo.jobsy.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private String street;
    private String city;
    private String state;
    private String country;
    private String zip;

    public String toLocation() {
        return street + ", " + city + ", " + state + ", " + country + ", " + zip;
    }
}
