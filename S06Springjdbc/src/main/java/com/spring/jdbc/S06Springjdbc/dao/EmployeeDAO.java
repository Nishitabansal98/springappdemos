package com.spring.jdbc.S06Springjdbc.dao;

import com.spring.jdbc.S06Springjdbc.dto.Employee;

public interface EmployeeDAO {

	int create(Employee employee);
	
	int update(Employee employee);
	
	int delete(int id);
	
}