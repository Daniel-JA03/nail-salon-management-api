package com.bynails.domain.entity;

import com.bynails.domain.entity.types.TipoServicio;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "servicios")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Servicio {
    @Id
    private String id;

    @NotBlank(message = "El nombre del servicio es obligatorio")
    private TipoServicio nombre;

    @NotNull(message = "El precio base es obligatorio")
    @PositiveOrZero(message = "El precio no puede ser negativo")
    private double precioBase;

    @NotNull(message = "La duración es obligatoria")
    @Min(value = 1, message = "La duración debe ser al menos de 1 minuto")
    private int duracionMinutos;

    private String imagenUrl; // url o base64
}
