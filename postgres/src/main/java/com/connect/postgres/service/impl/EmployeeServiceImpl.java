package com.connect.postgres.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.connect.postgres.model.Employee;
import com.connect.postgres.repository.EmployeeRepository;
import com.connect.postgres.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements  EmployeeService
{

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public void execute()
	{
		Employee emp = new Employee();
		emp.setEid(1);
		emp.setDid(1);
		emp.setEname("Anand");
		employeeRepository.saveAndFlush(emp);
	}
	
}
