package com.bynails.application.mapper.usuario;

import com.bynails.application.dto.usuario.UsuarioRequestDto;
import com.bynails.application.dto.usuario.UsuarioResponseDto;
import com.bynails.domain.entity.Rol;
import com.bynails.domain.entity.Usuario;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UsuarioMapper {

    // interfaz de Spring Security sirve para encriptar contraseñas
    private final PasswordEncoder passwordEncoder;

    public UsuarioResponseDto toDto(Usuario usuario) {
        if (usuario == null) return null;
        return UsuarioResponseDto.builder()
                .id(usuario.getId())
                .nombre(usuario.getNombre())
                .telefono(usuario.getTelefono())
                .correo(usuario.getCorreo())
                .rol(usuario.getRol().getNombre())
                .build();
    }

    public Usuario toEntity(UsuarioRequestDto requestDto, Rol rol) {
        if (requestDto == null) return null;
        if (rol == null) throw new IllegalArgumentException("El rol no puede ser nulo");

        return Usuario.builder()
                .nombre(requestDto.getNombre())
                .telefono(requestDto.getTelefono())
                .correo(requestDto.getCorreo())
                .password(passwordEncoder.encode(requestDto.getPassword())) // encriptada
                .rol(rol)
                .build();
    }
}
