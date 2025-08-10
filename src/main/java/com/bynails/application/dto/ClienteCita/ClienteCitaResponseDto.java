package com.bynails.application.dto.ClienteCita;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClienteCitaResponseDto {
    private String clienteId;
    private String nombre;
    private String telefono;
}
