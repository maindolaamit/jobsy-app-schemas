package org.hayo.jobsy.dto.registration;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
    @NotBlank
    @Min(5)
    private String name;
    @NotNull
    @NotBlank(message = "Email is required")
    private String email;
    @NotNull
    @NotBlank(message = "Password is required")
    private String password;
    @NotNull
    @NotBlank(message = "Phone is required")
    private String phone;
    @NotNull
    @NotBlank(message = "Industry is required")
    private String Industry;
    private Address address;
}
