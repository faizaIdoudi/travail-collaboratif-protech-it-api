package com.demo.services;

import java.util.List;



import com.demo.entities.Tache;

public interface TacheService {
	
	public Tache createTache(Tache tache);
	public List<Tache> getAll();
	public Tache getTacheById(long id);
	public Tache findByLibelle(String libelle);
	public void deleteTache(long id);

}
