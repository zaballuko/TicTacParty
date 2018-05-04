package Modelo;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class NivelModelo extends Conector{
	
	public ArrayList<Nivel> selectAll(){
		ArrayList<Nivel> listaJuegos = new ArrayList<Nivel>();
		try {
			Statement st = conexion.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM nivel");
			while(rs.next()){
				Nivel juego = new Nivel();
				juego.setCod(rs.getInt("cod"));
				juego.setNombre(rs.getString("nombre"));
				listaJuegos.add(juego);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaJuegos;
	}
	
	public Nivel select(int id){
		// crear juego
		Nivel nivel = new Nivel();

		// ejecutar consulta
		try {
			Statement st = super.conexion.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM nivel WHERE cod= " + id);
				while (rs.next()) {
					nivel.setCod(rs.getInt("cod"));
					nivel.setNombre(rs.getString("nombre"));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// devolver juego
				return nivel;
	}

}
