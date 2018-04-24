package Modelo;

public class Juego extends Conector{

	//Atributos
	private int cod;
	private String nombre;
	private String dificultad;
	private int part_jugadas;
	private Partida [] partidas;
	
	
	//Getters y Setters
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDificultad() {
		return dificultad;
	}
	public void setDificultad(String dificultad) {
		this.dificultad = dificultad;
	}
	public int getPart_jugadas() {
		return part_jugadas;
	}
	public void setPart_jugadas(int part_jugadas) {
		this.part_jugadas = part_jugadas;
	}
	public Partida[] getPartidas() {
		return partidas;
	}
	public void setPartidas(Partida[] partidas) {
		this.partidas = partidas;
	}
	
	
}
