package com.serverapp;

import lombok.*;

import java.time.LocalDateTime;

@Getter @Setter @Builder
@NoArgsConstructor
@AllArgsConstructor
public class Todo {
    private String todoId;
    private String todoName;
    private LocalDateTime createdAt;
}
