package com.bynails.domain.repository;

import com.bynails.domain.entity.Cita;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ICitaRepository extends MongoRepository<Cita, String> {
}
