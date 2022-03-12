package com.sofka;

import java.util.Scanner;

public class division {
	private double num2;
	public double resultadoDivision;
	private Scanner input;

	public double division(double numero1) {
		input = new Scanner(System.in);

		num2 = numero2();

		if (num2 == 0) {
			System.out.println("No se puede dividir entre cero. Empieza nuevamente desde cero.");
			System.out.println(" ");
			System.out.println(" ");
			resultadoDivision = 0;
		} else {
			resultadoDivision = dividir(numero1);
			System.out.println("el resultado de la división es: " + resultadoDivision);
			System.out.println(" ");
			System.out.println(" ");
		}
		return resultadoDivision;
	}

	private double numero2() {
		double numero2;
		System.out.println("Digita un numero para dividir");
		numero2 = input.nextDouble();
		return numero2;
	}

	public double dividir(double numero1) {
		resultadoDivision = numero1 / num2;
		return resultadoDivision;
	}
}
