package com.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entities.Activite;

public interface ActiviteRepository extends JpaRepository<Activite, Long> {
	
	public Activite findByTitre(String nom);

}
