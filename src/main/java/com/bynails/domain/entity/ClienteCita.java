package com.bynails.domain.entity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// Subdocumento
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClienteCita {

    @NotBlank(message = "El ID del cliente es obligatorio")
    private String clienteId;

    @NotBlank(message = "El nombre del cliente es obligatorio")
    private String nombre;

    @NotBlank(message = "El telefono es obligatorio")
    @Pattern(regexp = "\\d{9}", message = "El teléfono debe tener 9 digitos")
    private String telefono;
}
