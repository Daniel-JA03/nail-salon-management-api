package com.bynails.application.dto.cita;

import com.bynails.application.dto.clienteCita.ClienteCitaResponseDto;
import com.bynails.application.dto.pago.PagoResponseDto;
import com.bynails.application.dto.servicioCita.ServicioCitaResponseDto;
import com.bynails.application.dto.usuario.UsuarioResponseDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CitaResponseDto {
    private String id;
    private ClienteCitaResponseDto cliente;
    private List<ServicioCitaResponseDto> servicios;
    private UsuarioResponseDto empleado;
    private LocalDateTime fechaHora;
    private String estado;
    private PagoResponseDto pago;
    private String tipoAtencion;

    private Double costoTotal;
}
