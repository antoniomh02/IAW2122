package es.iestriana.ejerciciorectangulo.datos;

import java.util.Scanner;

public class Ejercicio {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Base: ");
		int base = sc.nextInt();
		
		System.out.println("Altura: ");
		int altura = sc.nextInt();
		
		int area = base * altura;
		int perimetro = 2 * (base + altura);
		System.out.println("Área: " + area);
		System.out.println("Perímetro: " + perimetro);
	}
}
