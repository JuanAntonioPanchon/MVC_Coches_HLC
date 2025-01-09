package com.hlc.coche.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hlc.coche.entidades.Coche;
import com.hlc.coche.servicios.CocheServicio;

import jakarta.annotation.PostConstruct;

@Component
public class InicializarDatos {

	@Autowired
	private CocheServicio cocheServicio;
	
	@PostConstruct
	public void init() {
		//Crear y guardar coches de ejemplo
		if (cocheServicio.listarTodosLosCoches().iterator().hasNext()) {
			//Si ya hay datos, no lo inicializamos
			return;
		}
		 	Coche coche1 = new Coche();
		 	coche1.setMarca("Coche 1");
		 	coche1.setPrecio(new Double("10.99"));
	        cocheServicio.guardarCoche(coche1);
	        
	        Coche coche2 = new Coche();
	        coche2.setMarca("Coche 2");
	        coche2.setPrecio(new Double("15.49"));
	        cocheServicio.guardarCoche(coche2);
	}
}
