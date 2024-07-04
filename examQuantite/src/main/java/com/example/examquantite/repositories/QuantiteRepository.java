package com.example.examquantite.repositories;

import com.example.examquantite.entities.Quantite;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface QuantiteRepository extends MongoRepository<Quantite, String> {
}