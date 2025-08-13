package com.bynails.application.mapper.servicio;

import com.bynails.application.dto.servicio.ServicioRequestDto;
import com.bynails.application.dto.servicio.ServicioResponseDto;
import com.bynails.domain.entity.Servicio;
import com.bynails.domain.entity.types.TipoServicio;
import org.springframework.stereotype.Component;

@Component
public class ServicioMapper {

    public ServicioResponseDto toDto(Servicio servicio) {
        if (servicio == null) return null;

        return ServicioResponseDto.builder()
                .id(servicio.getId())
                .nombre(servicio.getNombre().name()) // TipoServicio -> String
                .precioBase(servicio.getPrecioBase())
                .duracionMinutos(servicio.getDuracionMinutos())
                .imagenUrl(servicio.getImagenUrl())
                .build();
    }

    public Servicio toEntity(ServicioRequestDto requestDto) {
        if (requestDto == null) return null;

        return Servicio.builder()
                .nombre(TipoServicio.valueOf(requestDto.getNombre())) // String -> TipoServicio
                .precioBase(requestDto.getPrecioBase())
                .duracionMinutos(requestDto.getDuracionMinutos())
                .imagenUrl(requestDto.getImagenUrl())
                .build();
    }
}
