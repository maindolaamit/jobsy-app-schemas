package org.hayo.jobsy.dto.posts;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostComment {
    private String comment;
    private String commentedBy;
    private String previousCommentId;
    private LocalDateTime commentAt;
}
