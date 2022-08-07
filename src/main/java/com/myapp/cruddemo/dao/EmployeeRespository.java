package com.myapp.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.myapp.cruddemo.entity.Employee;

// @RepositoryRestResource(path="members")
public interface EmployeeRespository extends JpaRepository<Employee, Integer> {
	
	// that's it no need more code

}
