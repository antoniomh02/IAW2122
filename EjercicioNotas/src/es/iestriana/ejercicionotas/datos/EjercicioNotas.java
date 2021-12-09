package es.iestriana.ejercicionotas.datos;

import java.util.Scanner;

public class EjercicioNotas {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		System.out.println("Calificaci�n: ");
		int nota = sc.nextInt();
		
		if (nota >= 0 && nota < 5) {
			System.out.println("Insuficiente");
		} else if (nota >= 5 && nota < 6) {
			System.out.println("Suficiente");
		} else if (nota >= 6 && nota < 7) {
			System.out.println("Bien");
		} else if (nota >= 7 && nota < 9) {
			System.out.println("Notable");
		} else if (nota >= 9 && nota < 10) {
			System.out.println("Sobresaliente");
		} else if (nota == 10) {
			System.out.println("Matr�cula");
		} else {
			System.out.println("Nota incorrecta");
		}
		
		
		switch (nota) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("Insuficiente");
			break;
		case 5:
			System.out.println("suficiente");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 7:
		case 8:
			System.out.println("Notable");
			break;
		case 9:
			System.out.println("Sobresaliente");
			break;
		case 10:
			System.out.println("Matricula");
			break;
		default:
			System.out.println("Nota incorrecta");
			break;
		}
		
		sc.close();
		
	}

}
