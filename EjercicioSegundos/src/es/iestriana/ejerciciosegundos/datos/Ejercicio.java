package es.iestriana.ejerciciosegundos.datos;

import java.util.Scanner;

public class Ejercicio {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Segundos: ");
		int totalsegundos = sc.nextInt();
		
		int horas = totalsegundos / 3600;
		int minutos = (totalsegundos - (horas * 3600)) / 60;
		int segundos = totalsegundos - (horas * 3600) - (minutos * 60);
		System.out.println("Hora: " + horas + "H " + minutos + "M " + segundos+ "S " );
		
	}

}
