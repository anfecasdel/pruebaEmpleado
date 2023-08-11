package com.example.pruebaEmpleados.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.pruebaEmpleados.business.SalaryCalculator;
import com.example.pruebaEmpleados.model.Employee;
import com.example.pruebaEmpleados.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private SalaryCalculator salaryCalculator; // Inyecta SalaryCalculator

	@GetMapping("/fetch-employees")
	public String fetchEmployees() {
		employeeService.fetchAndSaveEmployees();
		return "Employees fetched and saved!";
	}

	@GetMapping("/view-json-data")
	public String viewJsonData() {
		return employeeService.getRawJsonData();
	}

	@GetMapping("/employee/{id}")
	public Employee getEmployeeDetails(@PathVariable Long id) {
		return employeeService.getEmployeeById(id);
	}

	@GetMapping("/calcular-salario-anual/{salarioMensual}")
	public double calcularSalarioAnual(@PathVariable double salarioMensual) {
		return salaryCalculator.calcularSalarioAnual(salarioMensual);
	}
}
