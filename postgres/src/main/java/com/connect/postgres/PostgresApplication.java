package com.connect.postgres;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.connect.postgres.service.EmployeeService;

@SpringBootApplication
public class PostgresApplication 
{

	public static void main(String[] args) 
	{
		ApplicationContext context = SpringApplication.run(PostgresApplication.class, args);
		EmployeeService service  = context.getBean(EmployeeService.class);
		service.execute();
	}

}
