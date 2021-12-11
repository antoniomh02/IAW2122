package cancion.poo;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		Musical lista = new CancionesLista();
		
		Cancion c1 = new Cancion("Nombre", "interprete", 90, 1902, "Rock");
		Cancion c2 = new Cancion("rakata", "almagro", 100, 2002, "trap");
		lista.nuevaCancion(c1);
		lista.nuevaCancion(c2);
		
		lista.mostrarTodas();
	}

}
