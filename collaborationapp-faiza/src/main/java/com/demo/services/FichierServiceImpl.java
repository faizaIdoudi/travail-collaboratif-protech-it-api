package com.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entities.Fichier;
import com.demo.repositories.FichierRepository;

@Service
public class FichierServiceImpl implements FichierService{
	@Autowired
	FichierRepository fichierRepository;


	@Override
	public Fichier createFichier(Fichier fichier) {
		// TODO Auto-generated method stub
		return fichierRepository.save(fichier);
	}

	@Override
	public List<Fichier> getAll() {
		// TODO Auto-generated method stub
		return fichierRepository.findAll();
	}

	@Override
	public Fichier getFichierById(long id) {
		// TODO Auto-generated method stub
		return fichierRepository.findById(id).get();
	}

	@Override
	public Fichier getFichierByTitre(String titre) {
		// TODO Auto-generated method stub
		return fichierRepository.findByTitre(titre);
	}

	
	@Override
	public void deleteFichier(long id) {
		// TODO Auto-generated method stub
		fichierRepository.deleteById(id);
		
	}

}
