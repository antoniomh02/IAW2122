package es.iestriana.dao;

import es.iestriana.bean.Conexion;
import es.iestriana.bean.Juego;

public interface JuegoDAO {

	Juego comprobarJuego(String name, String company, Conexion con);

}
