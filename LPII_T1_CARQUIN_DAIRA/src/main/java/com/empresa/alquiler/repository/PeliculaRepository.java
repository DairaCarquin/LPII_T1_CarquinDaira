package com.empresa.alquiler.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.empresa.alquiler.model.Pelicula;

@Repository public interface PeliculaRepository extends JpaRepository<Pelicula,Integer> {}

