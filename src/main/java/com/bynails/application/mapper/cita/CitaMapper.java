package com.bynails.application.mapper.cita;

import com.bynails.application.dto.cita.CitaRequestDto;
import com.bynails.application.dto.cita.CitaResponseDto;
import com.bynails.application.mapper.clienteCita.ClienteCitaMapper;
import com.bynails.application.mapper.pago.PagoMapper;
import com.bynails.application.mapper.servicioCita.ServicioCitaMapper;
import com.bynails.application.mapper.usuario.UsuarioMapper;
import com.bynails.domain.entity.Cita;
import com.bynails.domain.entity.ServicioCita;
import com.bynails.domain.entity.Usuario;
import com.bynails.domain.entity.types.EstadoCita;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class CitaMapper {
    private final ClienteCitaMapper clienteCitaMapper;
    private final ServicioCitaMapper servicioCitaMapper;
    private final PagoMapper pagoMapper;
    private final UsuarioMapper usuarioMapper;

    public CitaResponseDto toDto(Cita cita) {
        if (cita == null) return null;

        return CitaResponseDto.builder()
                .id(cita.getId())
                .cliente(clienteCitaMapper.toDto(cita.getCliente()))
                .servicios(cita.getServicios().stream()
                        .map(servicioCitaMapper::toDto)
                        .collect(Collectors.toList()))
                .empleado(usuarioMapper.toDto(cita.getEmpleado()))
                .fechaHora(cita.getFechaHora())
                .estado(cita.getEstado().name())
                .pago(pagoMapper.toDto(cita.getPago()))
                .tipoAtencion(cita.getTipoAtencion().name())
                .costoTotal(calcularCostoTotal(cita.getServicios()))
                .build();
    }

    /**
     * Convierte un CitaRequestDto a Cita, PERO sin llenar los servicios aún
     * Los servicios se completan en el servicio, después de buscarlos en BD
     */
    public Cita toEntitySinServicios(CitaRequestDto requestDto, Usuario empleado) {
        if (requestDto == null) return null;

        return Cita.builder()
                .cliente(clienteCitaMapper.toEntity(requestDto.getCliente()))
                .empleado(empleado)
                .fechaHora(requestDto.getFechaHora())
                .pago(pagoMapper.toEntity(requestDto.getPago()))
                .tipoAtencion(requestDto.getTipoAtencion())
                .estado(EstadoCita.PENDIENTE)
                .build();
    }

    private Double calcularCostoTotal(List<ServicioCita> servicioCitas) {
        return servicioCitas == null ? 0.0 : servicioCitas.stream()
                .mapToDouble(ServicioCita::getPrecio)
                .sum();
    }
}
