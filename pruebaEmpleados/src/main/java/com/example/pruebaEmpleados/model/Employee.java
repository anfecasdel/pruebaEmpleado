package com.example.pruebaEmpleados.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String employee_name;
	private double employee_salary;
	private int employee_age;

	// Getters y setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public double getEmployee_salary() {
		return employee_salary;
	}

	public void setEmployee_salary(double employee_salary) {
		this.employee_salary = employee_salary;
	}

	public int getEmployee_age() {
		return employee_age;
	}

	public void setEmployee_age(int employee_age) {
		this.employee_age = employee_age;
	}

}
