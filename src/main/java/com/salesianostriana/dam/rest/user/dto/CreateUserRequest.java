package com.salesianostriana.dam.rest.user.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateUserRequest {

    @NotBlank
    private String username;

    @NotBlank
    private String password;

    private String verifyPassword;

    private String avatar;

    private String fullName;

    private String email;


}
