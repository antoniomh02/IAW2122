package es.iestriana.examennoviembre.datos;
public class Ejercicio2 {

public static final int limite = 20;

public static boolean numero_primo(int n) {
	int cont = 2;
	boolean primo = true;
	while ((primo) && (cont != n)) {
		if (n % cont == 0)
			primo = false;
			cont++;
	}
	return primo;
	}

	public static boolean num_completo(int n) {
	int suma =0;
	for (int i = 1; i < n; i++) {
		if (n % i == 0) {
			suma = suma + i;
		}
	}
		if (suma == n) {
	return true;
		} else {
	return false;
	}
	}
	public static void main(String[] args) {
		int numero;
		for (int i = 0; i < limite; i++) {
			numero = (int) (Math.random() * 100);
				System.out.println("Numero aleatorio: "+numero);
			if (numero == 0) {
				System.out.println("El numero es igual a 0");
			}if (numero >= 50) {
				System.out.println("Este numero es mayor o igual que 50");
			} else{
				System.out.println("Este numero es menor que 50");
			} if (numero_primo(numero) == true) {
				System.out.println("Este numero es primo");
			} else{
				System.out.println("Este numero es no primo");
			} if (num_completo(numero)==true) {
				System.out.println("Este numero es un numero completo");
			}else {
				System.out.println("Este numero no es un numero completo");
			}
}
}

}