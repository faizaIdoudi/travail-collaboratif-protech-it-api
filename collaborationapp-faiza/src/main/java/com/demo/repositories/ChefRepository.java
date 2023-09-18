package com.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entities.Chef;

public interface ChefRepository extends JpaRepository<Chef, Long> {

	public List<Chef> findBySpecialite(String specialite);
}
