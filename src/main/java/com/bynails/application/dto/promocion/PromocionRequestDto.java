package com.bynails.application.dto.promocion;

import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class PromocionRequestDto {

    @NotBlank(message = "La descripción es obligatoria")
    private String descripcion;

    @NotNull(message = "El descuento es obligatorio")
    @DecimalMin(value = "0.1", message = "El descuento debe ser mayor a 0")
    @DecimalMax(value = "100.0", message = "El descuento no puede ser mayor a 100%")
    private Double descuento;

    @NotNull(message = "La fecha de inicio es obligatoria")
    @FutureOrPresent(message = "La fecha de inicio debe ser hoy o en el futuro")
    private LocalDateTime fechaInicio;

    @NotNull(message = "La fecha de fin es obligatorio")
    @Future(message = "La fecha de fin debe ser en el futuro")
    private LocalDateTime fechaFin;
}
