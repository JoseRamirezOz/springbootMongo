package com.example.apiRestMongoDb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import lombok.Data;
import java.util.*;

@Document(collection = "ServiciosSincronizacionRSI")
@Data
public class ServiciosSincronizacionRSI {

	@Id
	private String id;

	@Field
	private int idEmpresaProveedor;

	@Field
	private int idEmpresaCliente;

	@Field
	private String consecutivoliente;

	@Field
	private String consecutivoProveedor;

	@Field
	private List<BitacoraSincronizacionRSI> bitacoraAccionesSincronizacion;

}