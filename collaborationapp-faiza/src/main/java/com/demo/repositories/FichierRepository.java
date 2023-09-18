package com.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entities.Fichier;

public interface FichierRepository extends JpaRepository<Fichier, Long> {
	
	public Fichier findByTitre(String titre);

}
