package Modelo;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main (String[] args){
		UsuarioModelo usuarioModelo = new UsuarioModelo();
		ArrayList<Usuario> lista = usuarioModelo.selectAll();
		Iterator<Usuario> it = lista.iterator();
		while (it.hasNext()){
			Usuario usuario = new Usuario();
			usuario = (Usuario) it.next();
			System.out.println("El usuario es " + usuario.getNombre());
		}
		PartidaModelo partidaModelo = new PartidaModelo();
		int partidas = partidaModelo.partidasJugadas();
		System.out.println(partidas);
	}

}
