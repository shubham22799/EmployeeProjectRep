package com.spring.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.spring.employee.utilities.Employee;



@Component
public interface EmployeeServiceInterface {

public List<Employee> getEmployeesList();
	
	public Optional<Employee> getEmployee(long empId);
	
	public String addEmployee(Employee emp);
	
	public String updateEmployee(long empId,Employee emp);

	public String deleteEmployee(long empId);

	public String deleteAllEmployee();
}
