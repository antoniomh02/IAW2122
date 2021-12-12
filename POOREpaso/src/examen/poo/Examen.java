package examen.poo;

import java.util.Objects;

public class Examen {

	private String alumno;
	private int notas;
	private String asignatura;
	private boolean aprobado;
	
	public Examen() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Examen(String alumno, int notas, String asignatura, boolean aprobado) {
		super();
		this.alumno = alumno;
		this.notas = notas;
		this.asignatura = asignatura;
		this.aprobado = aprobado;
	}

	
	public String getAlumno() {
		return alumno;
	}

	public void setAlumno(String alumno) {
		this.alumno = alumno;
	}

	public int getNotas() {
		return notas;
	}

	public void setNotas(int notas) {
		this.notas = notas;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public boolean isAprobado() {
		return aprobado;
	}

	public void setAprobado(boolean aprobado) {
		this.aprobado = aprobado;
	}

	
	
	@Override
	public int hashCode() {
		return Objects.hash(alumno, aprobado, asignatura, notas);
	}

	
	public void comprobarAlumnos(Examen a1) {
        if (this.getAlumno().equals(a1.getAlumno())){
            System.out.println("Los examenes los ha realizado el alumno: "+a1.getAlumno());
        }else {
            System.out.println("Los examenes los han realizado los alumnos: "+this.getAlumno()+" y "+a1.getAlumno()+" respectivamente.");
        }

    }
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Examen other = (Examen) obj;
		return Objects.equals(alumno, other.alumno) && aprobado == other.aprobado
				&& Objects.equals(asignatura, other.asignatura) && notas == other.notas;
	}

	@Override
	public String toString() {
		return "Examen [alumno=" + alumno + ", notas=" + notas + ", asignatura=" + asignatura + ", aprobado=" + aprobado
				+ "]";
	}
	
	
}
