package org.hayo.jobsy.dto.company;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hayo.jobsy.dto.Address;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Office {
    private String contactName;
    private String contactEmail;
    private String contactPhone;
    private Address officeAddress;
}
