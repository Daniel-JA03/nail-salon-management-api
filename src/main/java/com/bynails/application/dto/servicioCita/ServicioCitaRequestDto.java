package com.bynails.application.dto.servicioCita;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ServicioCitaRequestDto {

    @NotBlank(message = "El ID del servicio es obligatorio")
    private String servicioId;

    // el backend obtiene el nombre, precio
}
