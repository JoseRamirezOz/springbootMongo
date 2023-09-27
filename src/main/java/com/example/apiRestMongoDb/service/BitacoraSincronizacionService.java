package com.example.apiRestMongoDb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.apiRestMongoDb.model.ServiciosSincronizacionRSI;
import com.example.apiRestMongoDb.repository.BitacoraSincronizacionRepository;

@Service
public class BitacoraSincronizacionService {
	@Autowired BitacoraSincronizacionRepository repository;
	
	ServiciosSincronizacionRSI data = new ServiciosSincronizacionRSI();
	
	public void guardarDatos(ServiciosSincronizacionRSI dataServicio) {
		repository.save(dataServicio);
	}
}
