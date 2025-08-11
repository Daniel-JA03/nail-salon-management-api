package com.bynails.application.mapper.rol;

import com.bynails.application.dto.rol.RolRequestDto;
import com.bynails.application.dto.rol.RolResponseDto;
import com.bynails.domain.entity.Rol;
import org.springframework.stereotype.Component;

@Component
public class RolMapper {
    public RolResponseDto toDto(Rol rol) {
        if (rol == null) return null;
        return RolResponseDto.builder()
                .nombre(rol.getNombre())
                .build();
    }

    public Rol toEntity(RolRequestDto rolRequestDto) {
        if (rolRequestDto == null) return null;
        return Rol.builder()
                .nombre(rolRequestDto.getNombre())
                .build();
    }

}
