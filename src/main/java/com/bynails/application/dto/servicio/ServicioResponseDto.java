package com.bynails.application.dto.servicio;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ServicioResponseDto {
    private String id;
    private String nombre;
    private Double precioBase;
    private Integer duracionMinutos;
    private String imagenUrl;
}
