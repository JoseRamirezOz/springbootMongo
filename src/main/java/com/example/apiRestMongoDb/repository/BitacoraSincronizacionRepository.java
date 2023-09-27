package com.example.apiRestMongoDb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.apiRestMongoDb.model.ServiciosSincronizacionRSI;

@Repository
public interface BitacoraSincronizacionRepository extends MongoRepository<ServiciosSincronizacionRSI, String> {

}
