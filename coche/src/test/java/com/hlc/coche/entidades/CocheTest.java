package com.hlc.coche.entidades;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CocheTest {
	private Coche coche;
	
	@BeforeEach
	void setup() {
		coche = new Coche();
	}

	@Test
	
	@DisplayName("Prueba de Getter and Setter de ID")
	void testSetAndGetID() {
		Long id = 1L;
		coche.setId(1L);
		
		assertEquals(id, coche.getId());
	}
	
	@Test
	@DisplayName("Prueba de Getter and Setter de Marca")
	void testSetAndGetMarca() {
		String marca = "Toyota";
		coche.setMarca(marca);
		assertEquals(marca, coche.getMarca(), "Se esperaba Toyota");
	}
	
	@Test
	@DisplayName("Prueba de Constructor con parametros")
	void testConstructorConParametros() {
		String marca = "Toyota";
		String matricula = "1234ABC";
		String color = "Rojo";
		double precio = 25000;
		
		Coche coche = new Coche (marca, matricula, color, precio);
		
		assertEquals(marca, coche.getMarca(), "La marca del constructor no coincide se esperaba Toyota");
		assertEquals(matricula, coche.getMatricula(), "La matricula del constructor no coincide se esperaba 1234ABC");
		assertEquals(color, coche.getColor(),"El color del constructor no coincide se esperaba Rojo");
		assertEquals(precio, coche.getPrecio(),"El precio del constructor no coincide se esperaba 25000");
		
	}

}
