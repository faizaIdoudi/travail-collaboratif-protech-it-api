package com.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class Activite  extends AuditModel {
	
  
	
	 private String titre;
	 private String description;
	 @JoinColumn(name="chef_id" , referencedColumnName="id")
	 @ManyToOne(optional=false)
	 private Chef chef;

}
