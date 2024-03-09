package org.hayo.jobsy.dto.posts;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PostReaction {
    private String userId;
    private String userName;
}
