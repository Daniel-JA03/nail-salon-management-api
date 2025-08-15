package com.bynails.domain.repository;

import com.bynails.domain.entity.Pago;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IPagoRepository extends MongoRepository<Pago, String> {
}
