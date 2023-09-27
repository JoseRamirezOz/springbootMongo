package com.example.apiRestMongoDb.model;

import lombok.Data;

@Data
public class BitacoraSincronizacionRSI extends BitacoraSincronizacionBase{

	private String accionAsignacion;

	private String accionReasignacion;

	private String accionCancelacionCCosto;

	private String accionCancelacionSCosto;

	private String accionContacto;

	private String accionTermino;

}
