package Modelo;


import java.util.ArrayList;

public class Nivel extends Conector{

	//Atributos
	private int cod;
	private String nombre;
	private String dificultad;
	
	
	
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

	
	
}
