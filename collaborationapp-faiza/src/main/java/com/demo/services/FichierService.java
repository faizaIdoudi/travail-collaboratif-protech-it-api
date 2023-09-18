package com.demo.services;

import java.util.List;



import com.demo.entities.Fichier;

public interface FichierService {
	
	public Fichier createFichier(Fichier fichier);
	public List<Fichier> getAll();
	public Fichier getFichierById(long id);
	public Fichier getFichierByTitre(String titre);
	public void deleteFichier(long id);

}
