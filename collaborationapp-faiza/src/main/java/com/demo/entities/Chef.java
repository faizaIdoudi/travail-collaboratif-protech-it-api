package com.demo.entities;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Chef extends Employee {

	@Column(nullable=false)
	private String specialite;
	
}
