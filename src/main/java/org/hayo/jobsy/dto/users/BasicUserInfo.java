package org.hayo.jobsy.dto.users;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@Builder
@NoArgsConstructor
public class BasicUserInfo {
    String id;
    String name;
    String headLine;
    String profilePictureUrl;
    String location;
    String email;
    String phone;
}
