package com.demo.entities;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name="grade")
public class Employee extends AuditModel {
	
    @Column(nullable=false)
	private String nom;
    @Column(nullable=false)
	private String prenom;
    @NotNull
	private String adresse;
    @Column(nullable=false , unique=true)
	private String tel;
    @Email
	private String email;
    @Column(nullable=false)
	private String password;
    @ManyToOne(fetch=FetchType.LAZY , optional =false ) 
    @JoinColumn(name="tache_id" , nullable=false)
    @OnDelete(action=OnDeleteAction.CASCADE)
    private Tache tache;
    @ManyToMany(mappedBy="employee")
    private List<Chat> chat=new ArrayList<Chat>();
    @ManyToMany(mappedBy="employee")
    private List<Fichier> fichier=new ArrayList<Fichier>();
	
}
