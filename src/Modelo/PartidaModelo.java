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
				NivelModelo NivelModelo = new NivelModelo();
				partida.setCod(rs.getInt("cod"));
				partida.setJugador(usuarioModelo.selectPorCod(rs.getInt("cod")));
				partida.setDificultad(rs.getString("dificultad"));
				partida.setGanador(rs.getString("ganador"));
				partida.setNivel(NivelModelo.select(rs.getInt("cod")));
						
				listaPartidas.add(partida);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaPartidas;
	}
	
	public void partidasJugadas(){
		PartidaModelo partidaModelo = new PartidaModelo();
		ArrayList<Partida> listaPartidas = partidaModelo.selectAll();
		int contPartida=0;
		int contGanado=0;
		int contPerdido=0;
		int contEmpate=0;
		Iterator<Partida> itPartida = listaPartidas.iterator();
		while (itPartida.hasNext()){
			Partida partida = itPartida.next();
			contPartida++;
			if(partida.getGanador().equals('0')){
				contGanado++;
			}else if(partida.getGanador().equals('1')){
				contPerdido++;
			}else{
				contEmpate++;
			}
		}
		System.out.println("El numero de partidad jugadas es: "+contPartida+" ha ganado un total de: "+contGanado+". Ha perdido un total de: "+contPerdido+". Ha empatado un total de: "+contEmpate);
	}

}
