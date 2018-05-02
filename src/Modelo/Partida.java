package Modelo;

public class Partida extends Conector{
	
	//Atributos
	private int cod;
	private Usuario jugador;
	private String dificultad;
	private String ganador;
	private Nivel juego;

	public int getCod() {
		return cod;
	}
	
	//Getters y Setters
	public void setCod(int cod) {
		this.cod = cod;
	}
	public Usuario getJugador() {
		return jugador;
	}
	public void setJugador(Usuario jugador) {
		this.jugador = jugador;
	}
	public String getDificultad() {
		return dificultad;
	}
	public void setDificultad(String dificultad) {
		this.dificultad = dificultad;
	}
	public String getGanador() {
		return ganador;
	}
	public void setGanador(String ganador) {
		this.ganador = ganador;
	}
	public Nivel getJuego() {
		return juego;
	}
	public void setJuego(Nivel juego) {
		this.juego = juego;
	}

}
