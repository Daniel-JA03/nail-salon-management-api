package com.bynails.domain.entity;

import com.bynails.domain.entity.types.MetodoPago;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pago {

    @NotNull(message = "El monto es obligatorio")
    @PositiveOrZero(message = "El monto no puede ser negativo")
    private double monto;

    @NotBlank(message = "El método de pago es obligatorio")
    private MetodoPago metodo; // "EFECTIVO", "TARJETA", "YAPE", "PLIN"

    @NotNull(message = "La fecha del pago es obligatoria")
    private LocalDateTime fecha;
}
