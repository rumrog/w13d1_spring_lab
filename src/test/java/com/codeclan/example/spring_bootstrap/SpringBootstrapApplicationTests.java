package com.codeclan.example.spring_bootstrap;

import com.codeclan.example.spring_bootstrap.models.Employee;
import com.codeclan.example.spring_bootstrap.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootstrapApplicationTests {

  @Autowired
  EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Employee harrison = new Employee("Harrison", 22, 1234, "harrison@codeclan.com");
		employeeRepository.save(harrison);
	}

}
