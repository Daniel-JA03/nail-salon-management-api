package com.bynails.application.dto.promocion;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PromocionResponseDto {
    private String id;
    private String descripcion;
    private Double descuento;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
}
