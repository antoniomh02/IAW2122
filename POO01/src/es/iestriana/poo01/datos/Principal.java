package es.iestriana.poo01.datos;

public class Principal {

	public static void main(String[] args) {
		Cuenta c1 = new Cuenta();
		Cuenta c2 = new Cuenta("Mi nimbre", "6666565775", 2000000, 3.5);
		
		c1.setNombre("otro nombre");
		c1.setCcc("576353763");
		c1.setSaldo(3000000);
		c1.setTipoDeInteres(2.3);
		
		
		c1.ingresar(10000);
		c2.reintegro(3000);
		
		System.out.println(c1);
		System.out.println(c2);
	}

}