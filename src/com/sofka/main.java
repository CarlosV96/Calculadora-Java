package com.sofka;

import java.util.Scanner;

public class main {
	private static Scanner input;
	private static int opcion;
	private static double numero1, resultado;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		suma s = new suma();
		resta r = new resta();
		multiplicacion m = new multiplicacion();
		division d = new division();
		modulo mod = new modulo();

		System.out.println("Recomendaciones: ");
		System.out.println("- los decimales, se ponen con una coma, no un punto.");
		System.out.println("- Cuando se divide entre cero, se reinicia el valor a 0");
		System.out.println("");

		numero1();
		menu();
		opcion = opcion();
		if (opcion == 1) {
			resultado = s.suma(numero1);
		} else if (opcion == 2) {
			resultado = r.resta(numero1);
		} else if (opcion == 3) {
			resultado = m.multiplicacion(numero1);
		} else if (opcion == 4) {
			resultado = d.division(numero1);
		} else if (opcion == 5) {
			resultado = mod.modulo(numero1);
		}

		do {
			menu2();
			opcion = opcion();
			if (opcion == 1) {
				resultado = s.suma(resultado);
			} else if (opcion == 2) {
				resultado = r.resta(resultado);
			} else if (opcion == 3) {
				resultado = m.multiplicacion(resultado);
			} else if (opcion == 4) {
				resultado = d.division(resultado);
			} else if (opcion == 5) {
				resultado = mod.modulo(resultado);
			}
		} while (opcion >= 1 && opcion <= 5);
	}

	private static void menu() {
		System.out.println(" ");
		System.out.println("Digita la opción que deseas.");
		submenu();
	}

	private static void menu2() {
		System.out.println(" ");
		System.out.println("Digita la operación que deseas realizar con este resultado (" + resultado + ")");
		submenu();
	}

	private static void submenu() {
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		System.out.println("5. Módulo de la division");
		System.out.println("6. Salir");
	}

	private static int opcion() {
		System.out.println("Ingresa la opcion que deseas ejecutar.");
		return input.nextInt();
	}

	public static double numero1() {
		System.out.println("Ingresa un número");
		numero1 = input.nextDouble();
		return numero1;
	}
}
