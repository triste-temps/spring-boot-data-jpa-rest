package com.myapp.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myapp.cruddemo.entity.Employee;

public interface EmployeeRespository extends JpaRepository<Employee, Integer> {
	
	// that's it no need more code

}
