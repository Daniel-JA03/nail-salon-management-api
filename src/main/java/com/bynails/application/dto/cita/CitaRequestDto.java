package com.bynails.application.dto.cita;


import com.bynails.application.dto.clienteCita.ClienteCitaRequestDto;
import com.bynails.application.dto.pago.PagoRequestDto;
import com.bynails.application.dto.servicioCita.ServicioCitaRequestDto;
import com.bynails.domain.entity.types.TipoAtencion;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
public class CitaRequestDto {

    @Valid
    @NotNull(message = "El cliente es obligatorio")
    private ClienteCitaRequestDto cliente; // embedido

    @Valid
    @NotNull(message = "Debe haber al menos un servicio")
    private List<@Valid ServicioCitaRequestDto> servicios; // embedidos

    @NotBlank(message = "El ID del empleado es obligatorio")
    private String empleadoId;

    @NotNull(message = "La fecha y hora son obligatorias")
    @Future(message = "La fecha y hora debe ser futura")
    private LocalDateTime fechaHora;

    @Valid
    private PagoRequestDto pago; // embedido

    @NotNull(message = "El tipo de atención es obligatorio")
    private TipoAtencion tipoAtencion;
}
