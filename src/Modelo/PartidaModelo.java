package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;



public class PartidaModelo extends Conector{

	public ArrayList<Partida> selectAll(){
		ArrayList<Partida> listaPartidas = new ArrayList<Partida>();
		try {
			Statement st = conexion.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM partidas");
			while(rs.next()){
				Partida partida = new Partida();
				partida.setCod(rs.getInt("cod"));
				partida.setJugador(UsuarioModelo.select(rs.getInt("cod")));
				partida.setDificultad(rs.getString("dificultad"));
				partida.setGanador(rs.getString("ganador"));
				partida.setJuego(JuegoModelo.select(rs.getInt("cod")));
						
				listaPartidas.add(partida);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaPartidas;
	}
}
