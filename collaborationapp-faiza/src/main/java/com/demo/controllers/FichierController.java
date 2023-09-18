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

import com.demo.entities.Fichier;
import com.demo.services.FichierService;


@RestController
@RequestMapping("/fichier")
public class FichierController {
	
	@Autowired
	FichierService fichierService;

	@PostMapping
	public Fichier createFichier(@RequestBody Fichier fichier) {
		return fichierService.createFichier(fichier);
	}
	

	@GetMapping
	public List<Fichier> getAllFichiers(){
		return fichierService.getAll();
	}
	
	
	@GetMapping("/{id}")
	public Fichier getFichierById(@PathVariable long id) {
		return  fichierService.getFichierById(id);
	}
	
	@GetMapping("/find/{titre}")
	public Fichier getFichierByTitre(@PathVariable String titre) {
		return fichierService.getFichierByTitre(titre);
	}
	
	
	 
	@DeleteMapping("/{id}")
	public void deleteFichier(@PathVariable long id) {
		fichierService.deleteFichier(id);
	}
}
