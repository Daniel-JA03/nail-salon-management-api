package com.bynails.application.dto.login;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginResponseDto {
    private String token;
    private String nombre;
    private String correo;
    private String role;
    private long expiresAt;
}
