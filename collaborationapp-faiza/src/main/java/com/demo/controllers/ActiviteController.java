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

import com.demo.entities.Activite;
import com.demo.services.ActiviteService;

@RestController
@RequestMapping("/activite")
public class ActiviteController {
	
	@Autowired
	ActiviteService activiteService;
	
	@PostMapping
	public Activite createActivite(@RequestBody Activite activite) {
		return activiteService.createActivite(activite);
	}
	

	
	@GetMapping("/{id}")
	public Activite getActiviteById(@PathVariable long id) {
		return activiteService.getActiviteById(id);
	}
	
	@GetMapping
	public List<Activite> getAllActivites(){
		return activiteService.getAll();
	}
	
	
	
	@GetMapping("/find/{titre}")
	public Activite getActiviteByTitre(@PathVariable String titre) {
		return activiteService.getActiviteByTitre(titre);
	}
	

	
	@DeleteMapping("/{id}")
	public void deleteActivite(@PathVariable long id) {
		activiteService.deleteActivite(id);

	}

}
