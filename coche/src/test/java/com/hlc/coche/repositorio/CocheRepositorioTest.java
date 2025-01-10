package com.hlc.coche.repositorio;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.hlc.coche.entidades.Coche;


@DataJpaTest
class CocheRepositorioTest {

	@Autowired
	private CocheRepositorio cocheRepositorio;
	
	@Test
	void testSaveAndFindAll() {
		//Crear y guardar coches
		Coche coche1 = new Coche ("Toyota" , "1234ABC", "Rojo", 25000.0);
		Coche coche2 = new Coche ("Ford" , "1235ABC", "Verde", 3500.0);
		
		cocheRepositorio.save(coche1);
		cocheRepositorio.save(coche2);
		
		List<Coche> coches = cocheRepositorio.findAll();
		
		Integer resultadoEsperado = 2;
		
		assertEquals(resultadoEsperado, coches.size(), "Deberia haber 2 coches");
		assertTrue(coches.stream().anyMatch(c -> c.getMarca().equals("Toyota")),"Deberia contener un coche Toyota");
		assertTrue(coches.stream().anyMatch(c -> c.getMarca().equals("Ford")),"Deberia contener un coche Ford");
		
		
	}
	

}
