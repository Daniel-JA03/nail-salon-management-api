package com.bynails.application.mapper.promocion;

import com.bynails.application.dto.promocion.PromocionRequestDto;
import com.bynails.application.dto.promocion.PromocionResponseDto;
import com.bynails.domain.entity.Promocion;
import org.springframework.stereotype.Component;

@Component
public class PromocionMapper {

    public PromocionResponseDto toDto(Promocion promocion) {
        if (promocion == null) return null; // evita errores (NullPointerException)

        return PromocionResponseDto.builder()
                .id(promocion.getId())
                .descripcion(promocion.getDescripcion())
                .descuento(promocion.getDescuento())
                .fechaInicio(promocion.getFechaInicio())
                .fechaFin(promocion.getFechaFin())
                .build();
    }

    public Promocion toEntity(PromocionRequestDto requestDto) {
        if (requestDto == null) return null;

        return Promocion.builder()
                .descripcion(requestDto.getDescripcion())
                .descuento(requestDto.getDescuento())
                .fechaInicio(requestDto.getFechaInicio())
                .fechaFin(requestDto.getFechaFin())
                .build();
    }
}
