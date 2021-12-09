package es.iestrana.ejerciciobuclesfs.datos;
import java.util.Scanner;
public class EjercicioBucle {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int num1; int num2;
	do {
		System.out.println("1º Nº: ");
		num1=sc.nextInt();
		System.out.println("2º Nº: ");
		num2=sc.nextInt();
	} while (num1 > num2);
		int total = 0;
		int impares = 0;
		int pares = 0;
		for (int i = num1; i <= num2; i += 7) {
			total++;
			System.out.println(i);
			if (i%2==0) {
				pares++;
	}else {
		impares += i;
	}
	}
		System.out.println("Son " + total + " numeros");
		System.out.println("Los impares son: " + impares);
		System.out.println("Son " + pares + " pares");
	}
	}
