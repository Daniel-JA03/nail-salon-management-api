package com.bynails.domain.repository;

import com.bynails.domain.entity.Servicio;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IServicioRepository extends MongoRepository<Servicio, String> {
}
