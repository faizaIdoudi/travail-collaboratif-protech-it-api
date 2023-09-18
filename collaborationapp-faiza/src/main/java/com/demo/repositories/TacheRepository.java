package com.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entities.Tache;

public interface TacheRepository extends JpaRepository<Tache, Long>  {
	public Tache findByLibelle(String libelle);

}
