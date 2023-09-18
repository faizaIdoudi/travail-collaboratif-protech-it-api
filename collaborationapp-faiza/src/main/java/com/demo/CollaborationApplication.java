package com.demo;








import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.entities.Activite;
import com.demo.entities.Chat;
import com.demo.entities.Employee;
import com.demo.entities.Fichier;
import com.demo.entities.Tache;
import com.demo.repositories.ActiviteRepository;
import com.demo.repositories.ChatRepository;
import com.demo.repositories.EmployeeRepository;
import com.demo.repositories.FichierRepository;
import com.demo.repositories.TacheRepository;
import com.demo.services.EmployeeService;

@SpringBootApplication
public class CollaborationApplication implements CommandLineRunner{
	
	@Autowired
	EmployeeService empServ;
	
	@Autowired
	TacheRepository tacheRepo;
	
	@Autowired
	ChatRepository chatrepo;
	
	@Autowired
	FichierRepository fichierRepo;
	
	@Autowired
	EmployeeRepository emprepo;
	
	@Autowired
	ActiviteRepository activerepo;
	
	
	

	public static void main(String[] args) {
		SpringApplication.run(CollaborationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		
	/*	Fichier fich1=new Fichier();
		fich1.setTitre("java documentation");
		Fichier fich2=new Fichier();
		fich2.setTitre("angular documentation");
		
		Tache tache1= new Tache(0," Préparer le rapport de vente mensuel","préparer le rapport de vente mensuel pour le mois en cours");
		tacheRepo.save(tache1);
	
		Chat msg1=new Chat();
		msg1.setContent("Hi !");
		Chat msg2=new Chat();
		msg2.setContent("Hello there !");
		
		Employee emp1=new Employee();
		emp1.setNom("idoudi");
		emp1.setPrenom("faiza");
		emp1.setTel("70184567");
		emp1.setAdresse("mahdia");
		emp1.setEmail("faiza.idoudi@gmail.com");
		emp1.setPassword("1234");
		emp1.setTache(tache1);
		
		emp1.getFichier().add(fich1);
		emp1.getFichier().add(fich2);
		emp1.getChat().add(msg1);
		emp1.getChat().add(msg2);
		
		//Employee emp2=new Employee(1,"john","jy","251846","20202020202020","johnnn@gmail.com","1258",null,null,null);
		//emprepo.save(emp2);
		
	  
	   fichierRepo.save(fich1);
	   fichierRepo.save(fich2);
	   chatrepo.save(msg1);
	   chatrepo.save(msg2);
	  // empServ.createEmployee(emp1);
	   
	   
	   Activite activite=new Activite(1,"","",null);
	   activerepo.save(activite);*/
		
	}

}
