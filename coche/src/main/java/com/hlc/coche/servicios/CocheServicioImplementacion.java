package com.hlc.coche.servicios;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hlc.coche.entidades.Coche;
import com.hlc.coche.repositorio.CocheRepositorio;


@Service
public class CocheServicioImplementacion implements CocheServicio{
	//o poner @Autowired y no tengo que poner el constructor pero lo ideal es sin el autowired
	
	private CocheRepositorio cocheRepositorio;
	
	public CocheServicioImplementacion(CocheRepositorio cocheRepositorio) {
		
	}

	@Override
	public List<Coche> obtenerTodosLosCoches() {
		return cocheRepositorio.findAll();
	}

	@Override
	public Coche obtenerCochePorId(Long id) {
		return cocheRepositorio.findById(id).orElseThrow(() -> new RuntimeException("Coche no encontrado con id: " + id));
	}

	@Override
	public Coche guardarCoche(Coche coche) {
		return cocheRepositorio.save(coche);
	}

	@Override
	public void eliminarCoche(Long id) {
		cocheRepositorio.deleteById(id);
	}
	
	
	

}
