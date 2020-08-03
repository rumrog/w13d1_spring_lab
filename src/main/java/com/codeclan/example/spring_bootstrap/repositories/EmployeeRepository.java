package com.codeclan.example.spring_bootstrap.repositories;

import com.codeclan.example.spring_bootstrap.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
