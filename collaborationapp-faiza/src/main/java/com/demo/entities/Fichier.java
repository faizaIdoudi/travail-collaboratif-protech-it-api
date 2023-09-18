package com.demo.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class Fichier extends AuditModel {



    private String titre;
    private String adresse; //url de fichier
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "fichier_employee",joinColumns = @JoinColumn(name = "fichier_id"),inverseJoinColumns = @JoinColumn(name = "employee_id"))
    private Set<Employee> employee=new HashSet<Employee>();
}
