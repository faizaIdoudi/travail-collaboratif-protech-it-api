package com.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entities.Employee;
import com.demo.services.EmployeeService;


@RestController
@RequestMapping("/employee")
public class EmployeeContoller {
	
	@Autowired
	EmployeeService employeeService;

	@PostMapping
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeService.createEmployee(employee);
	}
	
	
	@GetMapping("/{id}")
	public Employee getEmployeeById(@PathVariable long id) {
		return employeeService.getEmployeeById(id);
	}
	
	
	@GetMapping
	public List<Employee> getAllEmployees(){
		return employeeService.getAll();
	}

	
	
	@GetMapping("/find/{email}")
	public Employee findByEmail(@PathVariable String email) {
		return employeeService.findByEmail(email);
		
	}
	
	
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		employeeService.deleteEmployee(id);
		
	}
}
