package com.demo.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	  public Employee findByEmail(String email);

}
