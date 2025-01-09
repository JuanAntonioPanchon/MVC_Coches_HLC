package com.hlc.coche.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hlc.coche.entidades.Coche;


public interface CocheRepositorio extends JpaRepository<Coche, Long>{

}
