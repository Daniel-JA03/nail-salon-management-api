package com.bynails.application.dto.usuario;

import com.bynails.domain.entity.Rol;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UsuarioResponseDto {
    private String id;
    private String nombre;
    private String telefono;
    private String correo;
    private String rol;
}
