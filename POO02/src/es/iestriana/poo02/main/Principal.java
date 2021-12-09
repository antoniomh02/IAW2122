package es.iestriana.poo02.main;

import es.iestriana.poo02.datos.Circulo;
import es.iestriana.poo02.datos.Punto;
import es.iestriana.poo02.datos.Triangulo;

public class Principal {

	public static void main(String[] args) {
		Punto a = new Punto();
		Punto b = new Punto(1.1, 4.3);
		System.out.println("La distancia entre a y b es " + a.calcularDistanciaDesde(b));
		
		Circulo c = new Circulo(2, 3, 5.3);
		System.out.println("Area: " + c.calcularArea());
		System.out.println("Perimetro: " + c.calcularPerimetro());
		System.out.println("La distancaia del centro a b es: " + c.calcularDistanciaDesde(b));
		
		Triangulo t = new Triangulo(a, b, new Punto(4, 5));
		System.out.println("Area: " + t.calcularArea());
		System.out.println("Perimetro: " + t.calcularPerimetro());
		System.out.println("La distancia de p1 a b es: " + t.calcularDistanciaDesde(b));
	} 

}
