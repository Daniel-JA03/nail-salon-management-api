package com.bynails.application.mapper.servicioCita;

import com.bynails.application.dto.servicioCita.ServicioCitaRequestDto;
import com.bynails.application.dto.servicioCita.ServicioCitaResponseDto;
import com.bynails.domain.entity.ServicioCita;
import com.bynails.domain.entity.types.TipoServicio;
import org.springframework.stereotype.Component;

@Component
public class ServicioCitaMapper {

    public ServicioCitaResponseDto toDto(ServicioCita servicioCita) {
        if (servicioCita == null) return null;

        return ServicioCitaResponseDto.builder()
                .servicioId(servicioCita.getServicioId())
                .nombre(servicioCita.getNombre().name())
                .precio(servicioCita.getPrecio())
                .build();
    }

    /*public ServicioCita toEntity(ServicioCitaRequestDto requestDto) {
        if (requestDto == null) return null;

        return ServicioCita.builder()
                .servicioId(requestDto.getServicioId())
                .nombre(TipoServicio.valueOf(requestDto.getServicioId()))
                .precio(0.0)
                .build();
    }*/
}
