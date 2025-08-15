package com.bynails.domain.repository;

import com.bynails.domain.entity.Rol;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IRolRepository extends MongoRepository<Rol, String> {
}
