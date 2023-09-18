package com.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.demo.entities.Tache;
import com.demo.services.TacheService;

@RestController
@RequestMapping("/tache")
public class TacheController {
	
	@Autowired
	TacheService tacheService;

	@PostMapping
	public Tache createTache(@RequestBody Tache tache) {
		
		return tacheService.createTache(tache);
	}
	
	
	
	@GetMapping
	public List<Tache> getAllTaches(){
		return tacheService.getAll();
	}
	
	
	
	@GetMapping("/{id}")
	public Tache getTacheById(@PathVariable long id) {
		return tacheService.getTacheById(id);
	}
	
	
	
	@GetMapping("/find/{libelle}")
	public Tache findByLibelle(@PathVariable String libelle) {
		return tacheService.findByLibelle(libelle);
	}
	
	 
	 
	@DeleteMapping("/{id}")
	public void deleteTache(@PathVariable long id) {
		tacheService.deleteTache(id);
	}
}
