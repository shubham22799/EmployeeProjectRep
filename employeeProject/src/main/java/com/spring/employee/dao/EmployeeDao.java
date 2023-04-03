package com.spring.employee.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.employee.utilities.Employee;


public interface EmployeeDao extends JpaRepository<Employee, Long>{

}

