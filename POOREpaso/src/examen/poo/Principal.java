package examen.poo;

public class Principal {

	public static void main(String[] args) {
		
		Examen e1 = new Examen("egd", 5, "LM", false);
		Examen e2 = new Examen("asfd", 2, "BD", false);
		
		
		e1.comprobarAlumnos(e2);
	}

}
