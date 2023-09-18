package com.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entities.Tache;
import com.demo.repositories.TacheRepository;

@Service
public class TacheServiceImpl implements TacheService {
	
	@Autowired
	TacheRepository tacheRepository;

	@Override
	public Tache createTache(Tache tache) {
		// TODO Auto-generated method stub
		return tacheRepository.save(tache);
	}

	@Override
	public List<Tache> getAll() {
		// TODO Auto-generated method stub
		return tacheRepository.findAll();
	}

	@Override
	public Tache getTacheById(long id) {
		// TODO Auto-generated method stub
		return tacheRepository.findById(id).get();
	}

	@Override
	public Tache findByLibelle(String libelle) {
		// TODO Auto-generated method stub
		return tacheRepository.findByLibelle(libelle);
	}

	

	@Override
	public void deleteTache(long id) {
		// TODO Auto-generated method stub
		tacheRepository.deleteById(id);
	}

}
