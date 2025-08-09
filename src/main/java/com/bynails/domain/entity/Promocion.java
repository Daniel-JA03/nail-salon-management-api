package com.bynails.domain.entity;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "promociones")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Promocion {

    @Id
    private String id;

    @NotBlank(message = "La descripción es obligatoria")
    private String descripcion;

    @NotNull(message = "El descuento es obligatorio")
    @Positive(message = "El descuento debe ser mayor a 0")
    private double descuento; // en porcentaje

    @NotNull(message = "La fecha de inicio es obligatoria")
    @FutureOrPresent(message = "La fecha de inicio debe ser hoy o en el futuro")
    private LocalDateTime fechaInicio;

    @NotNull(message = "La fecha de fin es obligatorio")
    @Future(message = "La fecha de fin debe ser en el futuro")
    private LocalDateTime fechaFin;
}
