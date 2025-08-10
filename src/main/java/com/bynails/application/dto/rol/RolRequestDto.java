package com.bynails.application.dto.rol;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class RolRequestDto {

    @NotBlank(message = "El nombre del rol es obligatorio")
    @Pattern(
            regexp = "^(ADMIN|EMPLEADO|CLIENTE)$",
            message = "El rol debe ser uno de: ADMIN, EMPLEADO, CLIENTE"
    )
    private String nombre;
}
