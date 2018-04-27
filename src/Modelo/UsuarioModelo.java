package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Statement;

public class UsuarioModelo extends Conector{

	//Metodos
	
	/**
	 * Hace un select de todos los usuarios de la base de datos y los devuelve en un ArrayList
	 * @return ArrayList<Usuario> listaUsuarios
	 */
	public ArrayList<Usuario> selectAll(){
		ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
		try {
			Statement st = super.conexion.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM usuarios");
			while(rs.next()){
				Usuario usuario = new Usuario();
				usuario.setCod(rs.getInt("cod"));
				usuario.setEmail(rs.getString("email"));
				usuario.setContrasena(rs.getString("contrasena"));
				usuario.setNombre(rs.getString("nombre"));
				usuario.setApellidos(rs.getString("apellidos"));
				usuario.setEdad(rs.getInt("edad"));
				usuario.setRol(rs.getString("rol"));
				usuario.setTelefono(rs.getInt("telefono"));
				usuario.setPart_ganadas(rs.getInt("part_ganadas"));
				usuario.setPart_jugadas(rs.getInt("part_jugadas"));
				listaUsuarios.add(usuario);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaUsuarios;
	}
	
	/**
	 * Hace un select de un unico usuario por su codigo
	 * @param cod tipo int
	 * @return Usuario usuario
	 */
	public Usuario selectPorCod(int cod){
		Usuario usuario = new Usuario();
		try {
			PreparedStatement pst = super.conexion.prepareStatement("SELECT * FROM usuarios WHERE cod=?");
			pst.setInt(1, cod);
			ResultSet rs = pst.executeQuery();
			if(rs.next()){
				usuario.setCod(rs.getInt("cod"));
				usuario.setEmail(rs.getString("email"));
				usuario.setContrasena(rs.getString("contrasena"));
				usuario.setNombre(rs.getString("nombre"));
				usuario.setApellidos(rs.getString("apellidos"));
				usuario.setEdad(rs.getInt("edad"));
				usuario.setRol(rs.getString("rol"));
				usuario.setTelefono(rs.getInt("telefono"));
				usuario.setPart_ganadas(rs.getInt("part_ganadas"));
				usuario.setPart_jugadas(rs.getInt("part_jugadas"));				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return usuario;
	}
	
	/**
	 * Hace un select de todos los usuarios de la base de datos y los ordena por las partidas ganadas
	 * @return ArrayList<Usuario> listaRanking
	 */
	public ArrayList<Usuario> selectRanking(){
		ArrayList<Usuario> listaRanking = new ArrayList<Usuario>();
		try {
			Statement st = super.conexion.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM usuarios ORDER BY part_ganadas DESC");
			while(rs.next()){
				Usuario usuario = new Usuario();
				usuario.setCod(rs.getInt("cod"));
				usuario.setEmail(rs.getString("email"));
				usuario.setContrasena(rs.getString("contrasena"));
				usuario.setNombre(rs.getString("nombre"));
				usuario.setApellidos(rs.getString("apellidos"));
				usuario.setEdad(rs.getInt("edad"));
				usuario.setRol(rs.getString("rol"));
				usuario.setTelefono(rs.getInt("telefono"));
				usuario.setPart_ganadas(rs.getInt("part_ganadas"));
				usuario.setPart_jugadas(rs.getInt("part_jugadas"));
				listaRanking.add(usuario);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaRanking;
	}
	
}
