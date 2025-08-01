package com.fitness.userService.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RegisterRequest {
    @NotBlank(message = "email is required")
    @Email(message = "Invalid email format")
    private String email;
    @NotBlank(message = "Password id required")
    @Size(min = 6, message = "Password must have atleast 6 characters")
    private String password;
    private String keycloakId;
    private String firstName;
    private String lastName;
}
