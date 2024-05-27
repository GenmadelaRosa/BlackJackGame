package modelo;

import java.util.ArrayList;

public class Mano extends Mazo {
	public Mano() {
		//cerramos una list de cartas vacías
		this.cartas= new ArrayList<Carta>();
	}
	public int valorMano() {
		int valor=0;
		for(Carta c : this.cartas) {
			valor= valor +c.getValor();
		}
		return valor;
		
	}
		
}
