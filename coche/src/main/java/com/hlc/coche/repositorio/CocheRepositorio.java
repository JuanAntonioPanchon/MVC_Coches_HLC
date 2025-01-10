package com.hlc.coche.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hlc.coche.entidades.Coche;


@Repository
public interface CocheRepositorio extends JpaRepository<Coche, Long>{

}
