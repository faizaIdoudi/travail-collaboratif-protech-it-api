package com.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entities.Activite;
import com.demo.repositories.ActiviteRepository;

@Service
public class ActiviteServiceImpl implements ActiviteService {
	
	@Autowired
	ActiviteRepository activiteRepository;

	@Override
	public Activite createActivite(Activite activite) {
		// TODO Auto-generated method stub
		return activiteRepository.save(activite);
	}

	@Override
	public List<Activite> getAll() {
		// TODO Auto-generated method stub
		return activiteRepository.findAll();
	}

	@Override
	public Activite getActiviteById(long id) {
		// TODO Auto-generated method stub
		return activiteRepository.findById(id).get();
	}

	@Override
	public Activite getActiviteByTitre(String titre) {
		// TODO Auto-generated method stub
		return activiteRepository.findByTitre(titre);
	}


	@Override
	public void deleteActivite(long id) {
		// TODO Auto-generated method stub
		activiteRepository.deleteById(id);
	}

}
