package org.hayo.jobsy.dto.users;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserCreatedResponse {
    private String message;
    private String userId;
    private String userProfileUrl;
    private LocalDateTime timestamp;
}
