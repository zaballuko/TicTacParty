package Modelo;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class JuegoModelo extends Conector{
	
	public ArrayList<Juego> selectAll(){
		ArrayList<Juego> listaJuegos = new ArrayList<Juego>();
		try {
			Statement st = conexion.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM juegos");
			while(rs.next()){
				Juego juego = new Juego();
				juego.setCod(rs.getInt("cod"));
				juego.setNombre(rs.getString("nombre"));
				juego.setDificultad(rs.getString("dificultad"));
				juego.setPart_jugadas(rs.getInt("part_jugadas"));
				listaJuegos.add(juego);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaJuegos;
	}
	
	public Juego select(int id){
		// crear juego
		Juego juego = new Juego();

		// ejecutar consulta
		try {
			Statement st = super.conexion.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM juegos WHERE cod= " + id);
				while (rs.next()) {
					juego.setCod(rs.getInt("cod"));
					juego.setNombre(rs.getString("nombre"));
					juego.setDificultad(rs.getString("dificultad"));
					juego.setPart_jugadas(rs.getInt("part_jugadas"));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// devolver juego
				return juego;
	}

}
