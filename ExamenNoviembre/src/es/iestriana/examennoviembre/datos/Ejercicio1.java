package es.iestriana.examennoviembre.datos;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {
		private static Scanner sc = new Scanner(System.in);
		private static int [] cantidad;
		private static int [] numero;
		
		
	public static void main(String[] args) {
		int n = 0;
		do {
			System.out.println("nº del 1 al 15:");
			n = sc.nextInt();
		} while (n <= 0);
			cantidad = new int[n];
			numero = new int[n];
			
		System.out.println(Arrays.toString(cantidad));
		repetidos();
		
		System.out.println(Arrays.toString(numero));
}
				private static void repetidos() {
					int c = 0;
					int numeros = 0;
					
					for (int i = 0; i < cantidad.length; i++) {
						numeros = cantidad[i];
							for (int j = 0; j <= cantidad.length; j++) {
								if (numeros == cantidad[j]) {
									c++;
								}
							}
							if (c > 1) {
								c = 0;
							}else if (c <= 1) {
								numero[i] = numeros;
								c = 0;
							}
					}
					
				}
}
