package es.iestriana.ejercicionumeros.datos;
import java.util.Scanner;
public class ejercicio {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Nº: ");
		int num = sc.nextInt();
		
		if (num > 0 && num <=9) {
			System.out.println("El número " + num + " tiene un dígito.");
		} else if (num >= 10 && num <= 99) {
			System.out.println("El número " + num + " tiene dos dígitos");
		} else if (num >= 100 && num <= 999){
			System.out.println("El número " + num + " tiene tres dígitos");
		} else if (num >= 1000 && num <= 9999){
			System.out.println("El número " + num + " tiene cuatro dígitos");
		}

	}

}
