package com.hlc.coche.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hlc.coche.entidades.Coche;
import com.hlc.coche.repositorio.CocheRepositorio;

/*
@Service
public class CocheServicio {

	@Autowired
	private CocheRepositorio cocheRepositorio;
	
	public CocheServicio(CocheRepositorio cocheRepositorio) {
		this.cocheRepositorio= cocheRepositorio;
	}
	
	public Iterable <Coche> listarTodosLosCoches(){
		return cocheRepositorio.findAll();
	}
	
	public Coche guardarCoche(Coche coche) {
		return cocheRepositorio.save(coche);
	}
	
	public Coche obtenerCochePorId(Long id) {
		return cocheRepositorio.findById(id).orElseThrow(() -> 
        new IllegalArgumentException("Producto no encontrado con id: " + id));
	}
	
	public void eliminarCoche (Long id) {
		cocheRepositorio.deleteById(id);
	}
}
*/

public interface CocheServicio{
	List<Coche> obtenerTodosLosCoches();
	Coche obtenerCochePorId(Long id);
	Coche guardarCoche(Coche coche);
	void eliminarCoche(Long id);
}


