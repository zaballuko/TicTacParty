package Modelo;

import java.util.ArrayList;

import java.sql.*;

public class JuegoModelo extends Conector{
	
	public ArrayList<Juego> selectAll(){
		ArrayList<Juego> listarJuegos = new ArrayList<Juego>();
		try {
			Statement st = conexion.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM juegos");
			while(rs.next()){
				Juego juego = new Juego();
				juego.setId_juego(rs.getInt("id_juego"));
				juego.setNombre(rs.getString("nombre"));
				
				listarJuegos.add(juego);
				//añadir el juegoi a la lista
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listarJuegos;
		
	}
}
