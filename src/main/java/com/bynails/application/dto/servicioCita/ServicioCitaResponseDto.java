package com.bynails.application.dto.servicioCita;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ServicioCitaResponseDto {
    private String servicioId;
    private String nombre;
    private Double precio;
}
