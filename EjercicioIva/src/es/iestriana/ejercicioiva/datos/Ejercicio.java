package es.iestriana.ejercicioiva.datos;

import java.util.Scanner;

public class Ejercicio {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Precio del producto: ");
		double precioSiva = sc.nextDouble();
		
		double iva21 = (precioSiva * 0.21) + precioSiva;
		double iva18 = (precioSiva * 0.18) + precioSiva;
		double iva9 = (precioSiva * 0.09) + precioSiva;
		System.out.println("El precio con el 21% de IVA es: " + iva21);
		System.out.println("El precio con el 18% de IVA es: " + iva18);
		System.out.println("El precio con el 9% de IVA es: " + iva9);

	}

}
