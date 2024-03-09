package org.hayo.jobsy.dto.registration;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hayo.jobsy.dto.Address;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterCompanyRequest {
    private String name;
    private String email;
    private String password;
    private String phone;
    private String Industry;
    private Address address;
}
