package com.example.pruebaEmpleados.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.pruebaEmpleados.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}