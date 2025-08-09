package com.bynails.domain.entity;

import com.bynails.domain.entity.types.EstadoCita;
import com.bynails.domain.entity.types.TipoAtencion;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "citas")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cita {
    @Id
    private String id;

    @Valid
    @NotNull(message = "El cliente es obligatorio")
    private ClienteCita cliente; // embedido

    @Valid
    @NotNull(message = "Debe haber al menos un servicio")
    private List<ServicioCita> servicios; // embedidos

    @DBRef
    private Usuario empleado; // referencia

    @NotNull(message = "La fecha y hora son obligatorias")
    private LocalDateTime fechaHora;

    private EstadoCita estado; // "PENDIENTE", "CONFIRMADA", "COMPLETADA", "CANCELADA"

    @Valid
    private Pago pago; // embedido

    @NotNull(message = "El tipo de atención es obligatorio")
    private TipoAtencion tipoAtencion;
}
