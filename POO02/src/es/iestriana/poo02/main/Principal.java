package es.iestriana.poo02.main;

import es.iestriana.poo02.datos.Circulo;
import es.iestriana.poo02.datos.Punto;

public class Principal {

	public static void main(String[] args) {
		Punto a = new Punto();
		Punto b = new Punto(1.1, 4.3);
		System.out.println("La distancia entre a y b es " + a.calcularDistanciaDesde(b));
		
		Circulo c = new Circulo(2, 3, 5.3);
		System.out.println("Area: " + c.calcularArea());
		System.out.println("Perimetro: " + c.calcularPerimetro());
		System.out.println("La distancaia del centro a b es: " + c.calcularDistanciaDesde(b));
	} 

}
