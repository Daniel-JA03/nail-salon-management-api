package com.bynails.application.dto.pago;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class PagoRequestDto {

    @NotNull(message = "El monto es obligatorio")
    @DecimalMin(value = "0.0", inclusive = true, message = "El monto no puede ser negativo")
    private Double monto;

    @NotBlank(message = "El método de pago es obligatorio")
    private String metodo; // "EFECTIVO", "TARJETA", "YAPE", "PLIN"

    private LocalDateTime fecha;
}
