package com.bynails.application.mapper.pago;

import com.bynails.application.dto.pago.PagoRequestDto;
import com.bynails.application.dto.pago.PagoResponseDto;
import com.bynails.domain.entity.Pago;
import com.bynails.domain.entity.types.MetodoPago;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class PagoMapper {

    public PagoResponseDto toDto(Pago pago) {
        if (pago == null) return null;

        return PagoResponseDto.builder()
                .monto(pago.getMonto())
                .metodo(pago.getMetodo().name()) // MetodoPago -> String
                .fecha(pago.getFecha())
                .build();
    }

    public Pago toEntity(PagoRequestDto requestDto) {
        if (requestDto == null) return null;

        return Pago.builder()
                .monto(requestDto.getMonto() != null ? requestDto.getMonto() : 0.0)
                .metodo(MetodoPago.valueOf(requestDto.getMetodo())) // MetodoPago -> String
                .fecha(requestDto.getFecha() != null ? requestDto.getFecha() : LocalDateTime.now())
                .build();
    }
}
