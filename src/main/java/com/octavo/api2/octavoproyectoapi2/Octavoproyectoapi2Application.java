package com.octavo.api2.octavoproyectoapi2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import Conn.Funciones;

@SpringBootApplication
public class Octavoproyectoapi2Application {

	public static void main(String[] args) {
		SpringApplication.run(Octavoproyectoapi2Application.class, args);
		
		Funciones p = new Funciones();
		
		p.creaNotaCredito();
		p.creaIdTipoCredito();
		p.creaGuiaRemisionDespacho();
		p.creaChoferDespacho();
		p.creaDocumentoEmbarque();
		
	}

}
