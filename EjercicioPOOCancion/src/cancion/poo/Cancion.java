package cancion.poo;

import java.io.Serializable;
import java.util.Objects;

public class Cancion implements Serializable{

	private String nombre;
	private String interprete;
	private int duracion;
	private int anyo;
	private String genero;
	private int numeroReproducciones;
	private int calificacion;
	private boolean reproducir;
	
	
	
	public Cancion() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Cancion(String nombre, String interprete, int duracion, int anyo, String genero) {
		super();
		this.nombre = nombre;
		this.interprete = interprete;
		this.duracion = duracion;
		this.anyo = anyo;
		this.genero = genero;
		numeroReproducciones = 0;
		calificacion = 0;
		reproducir = true;
	}



	@Override
	public String toString() {
		return "Cancion [nombre=" + nombre + ", interprete=" + interprete + ", duracion=" + duracion + ", anyo=" + anyo
				+ ", genero=" + genero + ", numeroReproducciones=" + numeroReproducciones + ", calificacion="
				+ calificacion + ", reproducir=" + reproducir + "]";
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getInterprete() {
		return interprete;
	}



	public void setInterprete(String interprete) {
		this.interprete = interprete;
	}



	public int getDuracion() {
		return duracion;
	}



	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}



	public int getAnyo() {
		return anyo;
	}



	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}



	public String getGenero() {
		return genero;
	}



	public void setGenero(String genero) {
		this.genero = genero;
	}



	public int getNumeroReproducciones() {
		return numeroReproducciones;
	}



	public void setNumeroReproducciones(int numeroReproducciones) {
		this.numeroReproducciones = numeroReproducciones;
	}



	public int getCalificacion() {
		return calificacion;
	}



	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}



	public boolean isReproducir() {
		return reproducir;
	}



	public void setReproducir(boolean reproducir) {
		this.reproducir = reproducir;
	}



	@Override
	public int hashCode() {
		return Objects.hash(anyo, calificacion, duracion, genero, interprete, nombre, numeroReproducciones, reproducir);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cancion other = (Cancion) obj;
		return anyo == other.anyo && calificacion == other.calificacion && duracion == other.duracion
				&& Objects.equals(genero, other.genero) && Objects.equals(interprete, other.interprete)
				&& Objects.equals(nombre, other.nombre) && numeroReproducciones == other.numeroReproducciones
				&& reproducir == other.reproducir;
	}
	
	
	
}
