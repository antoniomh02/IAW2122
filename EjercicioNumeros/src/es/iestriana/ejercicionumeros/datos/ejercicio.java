package es.iestriana.ejercicionumeros.datos;
import java.util.Scanner;
public class ejercicio {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("N�: ");
		int num = sc.nextInt();
		
		if (num > 0 && num <=9) {
			System.out.println("El n�mero " + num + " tiene un d�gito.");
		} else if (num >= 10 && num <= 99) {
			System.out.println("El n�mero " + num + " tiene dos d�gitos");
		} else if (num >= 100 && num <= 999){
			System.out.println("El n�mero " + num + " tiene tres d�gitos");
		} else if (num >= 1000 && num <= 9999){
			System.out.println("El n�mero " + num + " tiene cuatro d�gitos");
		}

	}

}
