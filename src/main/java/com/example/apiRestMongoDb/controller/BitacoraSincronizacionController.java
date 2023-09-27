package com.example.apiRestMongoDb.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.apiRestMongoDb.model.BitacoraSincronizacionBase;
import com.example.apiRestMongoDb.model.BitacoraSincronizacionRSI;
import com.example.apiRestMongoDb.model.ServiciosSincronizacionRSI;
import com.example.apiRestMongoDb.service.BitacoraSincronizacionService;

@RestController
public class BitacoraSincronizacionController {
	@Autowired BitacoraSincronizacionService service;
	
	@PostMapping("/guardarUnServicio")
	public void guardarServicio(@RequestBody ServiciosSincronizacionRSI servicio) {
		ServiciosSincronizacionRSI datServicio = new ServiciosSincronizacionRSI();
		BitacoraSincronizacionRSI bitacoraServicio = new BitacoraSincronizacionRSI();
		
		List<BitacoraSincronizacionRSI> bitacoraRsi = new ArrayList<>();
		
		bitacoraServicio.setAccionAsignacion(servicio.getBitacoraAccionesSincronizacion().get(0).getAccionAsignacion());
		bitacoraRsi.add(bitacoraServicio);
		
		datServicio.setId("1234");
		datServicio.setIdEmpresaProveedor(servicio.getIdEmpresaProveedor());
		datServicio.setIdEmpresaCliente(servicio.getIdEmpresaCliente());
		datServicio.setBitacoraAccionesSincronizacion(bitacoraRsi);
		
		
		
		
		
		service.guardarDatos(datServicio);
	}
}
