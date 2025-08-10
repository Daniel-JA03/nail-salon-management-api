package com.bynails.domain.entity;

import com.bynails.domain.entity.types.TipoServicio;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// Subdocumento -> un servicio dentro de una cita
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ServicioCita {

    @NotBlank(message = "El ID del servicio es obligatorio")
    private String servicioId; // ID del servicio original

    @NotBlank(message = "El nombre del servicio es obligatorio")
    private TipoServicio nombre;

    @NotNull(message = "El precio es obligatorio")
    @PositiveOrZero(message = "El precio no puede ser negativo")
    private double precio;
}
