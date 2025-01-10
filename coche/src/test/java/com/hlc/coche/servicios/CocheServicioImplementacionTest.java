package com.hlc.coche.servicios;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;

import java.util.List;

import org.assertj.core.util.Arrays;
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
		List <Coche> coches = Arrays.asList(new Coche ("Toyota" , "1234ABC" , "Rojo" , 25000.0));
		
		when(cocheRepositorio.findAll()).thenReturn(coches);
		
		//Llamar al servicio
		List<Coche> cochesServicios = cocheServicio.obtenerTodosLosCoches();
		Integer resultadoEsperado = 2;
		Integer resultado = coches.size();
		
		assertEquals(resultadoEsperado, resultado, "Debe de devolver 2 coches");
		verify(cocheRepositorio, times(1)).findAll();
	}
	
	
	
	
}
