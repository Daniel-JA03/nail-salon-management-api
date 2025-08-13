package com.bynails.application.mapper.clienteCita;

import com.bynails.application.dto.clienteCita.ClienteCitaRequestDto;
import com.bynails.application.dto.clienteCita.ClienteCitaResponseDto;
import com.bynails.domain.entity.ClienteCita;
import org.springframework.stereotype.Component;

@Component
public class ClienteCitaMapper {

    public ClienteCitaResponseDto toDto(ClienteCita clienteCita) {
        if (clienteCita == null) return null;

        return ClienteCitaResponseDto.builder()
                .clienteId(clienteCita.getClienteId())
                .nombre(clienteCita.getNombre())
                .telefono(clienteCita.getTelefono())
                .build();
    }

    public ClienteCita toEntity(ClienteCitaRequestDto requestDto) {
        if (requestDto == null) return null;

        return ClienteCita.builder()
                .clienteId(requestDto.getClienteId())
                .nombre(requestDto.getNombre())
                .telefono(requestDto.getTelefono())
                .build();
    }
}
