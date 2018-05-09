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
				listaRanking.add(usuario);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaRanking;
	}
	
	public Usuario selectPorEmailContrasena(String email, String contrasena){
		
		Statement st;
		ResultSet rs;
		try {
			st = super.conexion.createStatement();
			rs = st.executeQuery("SELECT * FROM usuarios WHERE email='" + email + "'" + "AND contrasena='" + contrasena + "'");
			if(rs.next()){
				Usuario usuario = new Usuario();
				usuario.setCod(rs.getInt(1));
				usuario.setEmail(rs.getString(2));
				usuario.setContrasena(rs.getString(3));
				usuario.setNombre(rs.getString(4));
				usuario.setApellidos(rs.getString(5));
				usuario.setEdad(rs.getInt(6));
				usuario.setRol(rs.getString(7));
				usuario.setTelefono(rs.getInt(8));
				return usuario;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
