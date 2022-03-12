package es.iestriana.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import es.iestriana.bean.Conexion;
import es.iestriana.bean.Juego;

public class JuegoDAOBD implements JuegoDAO{

	@Override
	public Juego comprobarJuego(String name, String company, Conexion con) {
		Juego jAux = null;
		
		String query = "SELECT * FROM videogames WHERE name = ? AND company = ?";
		try {
			PreparedStatement ps = con.getConector().prepareStatement(query);
			
			ps.setString(1, name);
			ps.setString(2, company);
			
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				jAux = new Juego(rs.getInt("idVideogame"),
									rs.getString("name"), 
									rs.getInt("anyo"), 
									rs.getString("company"), 
									rs.getString("type"), 
									rs.getByte("photo"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jAux;
	}

	
}
