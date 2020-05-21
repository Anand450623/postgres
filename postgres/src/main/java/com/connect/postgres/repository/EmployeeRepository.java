package com.connect.postgres.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.connect.postgres.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>  
{	

}
