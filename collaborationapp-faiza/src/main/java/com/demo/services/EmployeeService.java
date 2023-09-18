package com.demo.services;



import java.util.List;



import com.demo.entities.Employee;

public interface EmployeeService {
	
	public Employee createEmployee(Employee emp);
	public Employee getEmployeeById(Long id);
	public List<Employee> getAll();
	public void deleteEmployee(Long id);
    public Employee findByEmail(String email);

}
