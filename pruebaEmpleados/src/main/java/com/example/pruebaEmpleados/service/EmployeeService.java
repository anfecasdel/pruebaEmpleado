package com.example.pruebaEmpleados.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.pruebaEmpleados.business.SalaryCalculator;
import com.example.pruebaEmpleados.model.Employee;
import com.example.pruebaEmpleados.model.EmployeeResponse;
import com.example.pruebaEmpleados.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private SalaryCalculator salaryCalculator; // Inyecta SalaryCalculator

	public void fetchAndSaveEmployees() {
		RestTemplate restTemplate = new RestTemplate();
		String apiUrl = "https://dummy.restapiexample.com/api/v1/employees";
		ResponseEntity<EmployeeResponse> responseEntity = restTemplate.exchange(apiUrl, HttpMethod.GET, null,
				EmployeeResponse.class);

		if (responseEntity.getStatusCode() == HttpStatus.OK) {
			EmployeeResponse employeeResponse = responseEntity.getBody();
			Employee[] employees = employeeResponse.getData();
			employeeRepository.saveAll(Arrays.asList(employees));
		} else {
			// Manejar el caso de error de la API externa si es necesario
		}
	}

	public String getRawJsonData() {
		RestTemplate restTemplate = new RestTemplate();
		String apiUrl = "https://dummy.restapiexample.com/api/v1/employees";
		ResponseEntity<String> responseEntity = restTemplate.exchange(apiUrl, HttpMethod.GET, null, String.class);

		if (responseEntity.getStatusCode() == HttpStatus.OK) {
			return responseEntity.getBody();
		} else {
			// Manejar el caso de error de la API externa si es necesario
			return "Error fetching JSON data";
		}
	}

	public Employee getEmployeeById(Long id) {
		// Buscar el empleado por su ID en la base de datos
		// Utiliza el EmployeeRepository para acceder a la base de datos H2
		// Retorna null si no se encuentra el empleado con el ID especificado
		return employeeRepository.findById(id).orElse(null);
	}

	public double calcularSalarioAnualEmpleado(double salarioMensual) {
		return salaryCalculator.calcularSalarioAnual(salarioMensual);
	}
}
