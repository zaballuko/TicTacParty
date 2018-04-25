package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Statement;

public class UsuarioModelo extends Conector{

	//Metodos
	
	public ArrayList<Usuario> selectAll(){
		ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
		try {
			Statement st = conexion.createStatement();
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

	public static Usuario select(int id) {
		// crear usuario
		Usuario usuario = new Usuario();

		// ejecutar consulta
		try {
			Statement st = conexion.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM usuarios WHERE cod= " + id);
			while (rs.next()) {
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// devolver usuario
		return usuario;

	}
}
