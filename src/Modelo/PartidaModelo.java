package Modelo;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;



public class PartidaModelo extends Conector{

	public ArrayList<Partida> selectAll(){
		ArrayList<Partida> listaPartidas = new ArrayList<Partida>();
		try {
			Statement st = conexion.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM partidas");
			while(rs.next()){
				Partida partida = new Partida();
				UsuarioModelo usuarioModelo = new UsuarioModelo();
				JuegoModelo juegoModelo = new JuegoModelo();
				partida.setCod(rs.getInt("cod"));
				partida.setJugador(usuarioModelo.selectPorCod(rs.getInt("cod")));
				partida.setDificultad(rs.getString("dificultad"));
				partida.setGanador(rs.getString("ganador"));
				partida.setNivel(juegoModelo.select(rs.getInt("cod")));
						
				listaPartidas.add(partida);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaPartidas;
	}
	
	public int partidasJugadas(){
		PartidaModelo partidaModelo = new PartidaModelo();
		ArrayList<Partida> listaPartidas = partidaModelo.selectAll();
		int contPartida=0;
		Iterator<Partida> itPartida = listaPartidas.iterator();
		while (itPartida.hasNext()){
			Partida partida = new Partida();
			partida = (Partida) itPartida.next();
			contPartida++;
		}
		return contPartida;
	}

}
