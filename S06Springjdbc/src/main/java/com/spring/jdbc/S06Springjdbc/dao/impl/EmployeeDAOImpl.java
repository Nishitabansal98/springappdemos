package com.spring.jdbc.S06Springjdbc.dao.impl;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.S06Springjdbc.dao.EmployeeDAO;
import com.spring.jdbc.S06Springjdbc.dto.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int create(Employee emp) {
		String sql = "insert into employee values (?, ?, ?)";
		int result = jdbcTemplate.update(sql, emp.getId(), emp.getFirstName(), emp.getLastName());
		System.out.println("Employee created");
		return result;
	}

	public int update(Employee emp) {
		String sql = "update employee set firstname=?, lastname=? where id=?";
		int result = jdbcTemplate.update(sql, emp.getFirstName(), emp.getLastName(), emp.getId());
		System.out.println("Employee updated");
		return result;
	}

	public int delete(int id) {
		String sql = "delete from employee where id=?";
		int result = jdbcTemplate.update(sql, id);
		System.out.println("Employee deleted");
		return result;
	}

}