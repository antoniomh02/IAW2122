package es.iestriana.ejerciciobucles.datos;
import java.util.Scanner;
public class Ejercicio2 {
	/*
	 * Leer una serie de n n�meros (del usuario). Mostrar si los n�meros
	 * est�n en orden creciente, decreciente o desordenados
	 */
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int cantidadNumeros = 0;
		do {
			System.out.println("N�meros: ");
			cantidadNumeros = sc.nextInt();
		} while (cantidadNumeros <= 0);
		
		int orden = comprobarOrden(cantidadNumeros);
		
		switch (orden) {
			case 0:
				System.out.println("DESORDENADO");
				break;
			case -1:
				System.out.println("DECRECIENTE");
				break;
			case 1:
				System.out.println("CRECIENTE");
				break;
			default:
				break;
		}
		
		sc.close();
	}

	private static int comprobarOrden(int cantidadNumeros) {
		int numero = 0, auxiliar = 0;
		boolean creciente = false, decreciente = false;
		
		for (int i = 0; i < cantidadNumeros; i++) {
			System.out.println("N�: ");
			numero = sc.nextInt();
			
			if (i == 0) {
				auxiliar = numero;
			} else {
				if (numero > auxiliar) {
					creciente = true;
				} else if (numero < auxiliar) {
					decreciente = true;
				}
				auxiliar = numero;
			}
		}
		
		if (creciente && decreciente) {
			return 0;
		} else if (creciente && !decreciente) {
			return 1;
		} else {
			return -1;
		}
	}

}