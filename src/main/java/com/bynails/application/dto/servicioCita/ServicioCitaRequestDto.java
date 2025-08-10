package com.bynails.application.dto.servicioCita;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ServicioCitaRequestDto {

    @NotBlank(message = "El ID del servicio es obligatorio")
    private String servicioId;

    @NotBlank(message = "El nombre del servicio es obligatorio")
    private String nombre; // TipoServicio == String

    @NotNull(message = "El precio es obligatorio")
    @DecimalMin(value = "0.0", inclusive = true ,message = "El precio no puede ser negativo")
    private Double precio;
}
