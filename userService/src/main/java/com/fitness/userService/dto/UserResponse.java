package com.fitness.userService.dto;

import com.fitness.userService.model.UserRole;
import lombok.Data;


import java.time.LocalDateTime;
@Data
public class UserResponse {
    private String id;
    private String keycloakId;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
