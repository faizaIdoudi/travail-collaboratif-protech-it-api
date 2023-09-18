package com.demo.services;

import java.util.List;



import com.demo.entities.Activite;

public interface ActiviteService {
	
	public Activite createActivite(Activite activite);
	public List<Activite> getAll();
	public Activite getActiviteById(long id);
	public Activite getActiviteByTitre(String titre);
	public void deleteActivite(long id);

}
