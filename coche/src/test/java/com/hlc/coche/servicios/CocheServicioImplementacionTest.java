package com.hlc.coche.servicios;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


import java.util.List;

import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.hlc.coche.entidades.Coche;
import com.hlc.coche.repositorio.CocheRepositorio;

class CocheServicioImplementacionTest {

	@Mock // -> Simulamos el repositorio como Dependencia
	private CocheRepositorio cocheRepositorio;

	@InjectMocks //-> Creamos una instancia real de CocheServicioImplementacion y se inyecta automaticamente el 
	//mock de coche repositorio en esta clase
	
	private CocheServicioImplementacion cocheServicio;
	
	
	@BeforeEach
	void setup() {
		MockitoAnnotations.openMocks(this);
	}
	
	@Test
	void obtenerTodosLosCoches() {
	    // Creamos una lista con un solo coche
	    List<Coche> coches = Arrays.asList(new Coche("Toyota", "1234ABC", "Rojo", 25000.0));

	    // Simulamos que el repositorio devolverá esta lista
	    when(cocheRepositorio.findAll()).thenReturn(coches);

	    // Llamamos al servicio
	    List<Coche> cochesServicios = cocheServicio.obtenerTodosLosCoches();

	    // Valor esperado debe ser 1 porque solo hay un coche en la lista
	    Integer resultadoEsperado = 1;
	    Integer resultado = cochesServicios.size(); // Esto devolverá 1, ya que solo hay un coche en la lista mockeada

	    // Verificamos que el tamaño de la lista es 1
	    assertEquals(resultadoEsperado, resultado, "Debe de devolver 1 coche");

	    // Verificamos que el método findAll() del repositorio fue llamado una vez
	    verify(cocheRepositorio, times(1)).findAll();
	}

	
	
	
}
