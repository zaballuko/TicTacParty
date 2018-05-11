package Modelo;

import java.util.ArrayList;


public class Usuario{

	//Atributos
	private int cod;
	private String email;
	private String contrasena;
	private String nombre;
	private String apellidos;
	private int edad;
	private String rol;
	private int telefono;
	private ArrayList<Partida> partidas;
	
	
	//Constructores
		public Usuario(){
		}
		
		public Usuario(String email,String contrasena,String nombre,String apellidos,int edad,String rol,int telefono){
			this.email=email;
			this.contrasena=contrasena;
			this.nombre=nombre;
			this.apellidos=apellidos;
			this.edad=edad;
			this.rol=rol;
			this.telefono=telefono;
		}
	//Getters y Setters
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public ArrayList<Partida> getPartidas() {
		return partidas;
	}
	public void setPartidas(ArrayList<Partida> partidas) {
		this.partidas = partidas;
	}

	
}
