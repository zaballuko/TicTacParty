package Modelo;

public class Partida{
	
	//Atributos
	private int cod;
	private Usuario jugador;
	private int ganador;
	private Nivel nivel;

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
	public int getGanador() {
		return ganador;
	}
	public void setGanador(int ganador) {
		this.ganador = ganador;
	}

	public Nivel getNivel() {
		return nivel;
	}
	public void setNivel(Nivel juego) {
		this.nivel = juego;
	}

}
