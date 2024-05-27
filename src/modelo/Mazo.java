package modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import modelo.Carta.Palo;

public class Mazo {
	//Variables miembro 
	protected List<Carta> cartas;
	
	public Mazo() {
		//Creamos lista de Cartas vacías
		this.cartas = new ArrayList<Carta>();
		for(Palo p:Palo.values()) {
			for(int i=1; i<=13; i++) {
				Carta carta = new Carta (i, p);
				this.cartas.add(carta);
				
			}
			
		}
	}

	@Override
	public String toString() {
		return "Mazo [cartas=" + cartas + "]";
	}
	public Carta solicitarCarta() throws NoHayMasCartasException {
		if(this.cartas.size()==0) {
			throw new NoHayMasCartasException();
		}
		Carta c= this.cartas.get(0);
		this.cartas.remove(0);
		return c;
	}

	public void barajar() {
		Collections.shuffle(cartas);
	}
	
	

}
