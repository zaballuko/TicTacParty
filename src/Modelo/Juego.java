package Modelo;

public class Juego {
	
	private int id_juego;
	private String nombre;
	
	/**
	 * @return the id_juego
	 */
	public int getId_juego() {
		return id_juego;
	}
	/**
	 * @param id_juego the id_juego to set
	 */
	public void setId_juego(int id_juego) {
		this.id_juego = id_juego;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//crear controlador servlet clase en el modelo con claseMOdelo y el metodo listar juegos y hacer vista y a correr
}
