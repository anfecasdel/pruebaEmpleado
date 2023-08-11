package com.example.pruebaEmpleados.business;

import org.springframework.stereotype.Component;

@Component
public class SalaryCalculator {
	public double calcularSalarioAnual(double salarioMensual) {
		return salarioMensual * 12;
	}
}
