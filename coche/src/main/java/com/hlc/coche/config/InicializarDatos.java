package com.hlc.coche.config;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hlc.coche.entidades.Coche;
import com.hlc.coche.servicios.CocheServicio;

import jakarta.annotation.PostConstruct;

@Component
public class InicializarDatos {

	//@Autowired No es necesario si ponemos un constructor el de InicializarDatos (CocheServicio cocheServicio)
	private CocheServicio cocheServicio;
	
	
	public InicializarDatos(CocheServicio cocheServicio) {
		this.cocheServicio = cocheServicio;
	}
	
	@PostConstruct
	public void init() {
		//Crear y guardar coches de ejemplo
		if (cocheServicio.listarTodosLosCoches().iterator().hasNext()) {
			//Si ya hay datos, no lo inicializamos
			return;
		}
		 	Coche coche1 = new Coche();
		 	coche1.setMarca("Toyota");
		 	coche1.setPrecio(new Double("25000"));
	        cocheServicio.guardarCoche(coche1);
	        
	        Coche coche2 = new Coche();
	        coche2.setMarca("Mercedes");
	        coche2.setPrecio(new Double("38500"));
	        cocheServicio.guardarCoche(coche2);
	}
}
