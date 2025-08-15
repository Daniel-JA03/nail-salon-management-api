package com.bynails.domain.repository;

import com.bynails.domain.entity.Promocion;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IPromocionRepository extends MongoRepository<Promocion, String> {
}
