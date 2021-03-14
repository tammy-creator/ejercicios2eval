package unidad5;

import java.util.ArrayList;
import java.util.Random;

public class Mazo {
	private ArrayList<Naipe> baraja = new ArrayList<Naipe>();
	private ArrayList<Mazo> barajas = new ArrayList<Mazo>();
	public Mazo() {
		
		for(Valor valor: Valor.values()) {
			for(Palo palo: Palo.values()) {
				baraja.add(new Naipe(palo,valor));
			}
		}	
	}
	public Mazo(int n) {
		for(int i=0; i<n;i++) {
			barajas.add(new Mazo());
		}
	}
	public Naipe get() {
		Random aleatorio = new Random();
		int carta = aleatorio.nextInt(baraja.size());
		return baraja.get(carta);				
	}
	
	public ArrayList<Naipe> getBaraja() {
		return baraja;
	}
	
	public Naipe getNaipe(int indice) {
		return baraja.get(indice);	
	}
	
	public Naipe remove() {
		Random aleatorio = new Random();
		int carta = aleatorio.nextInt(baraja.size());
		return baraja.remove(carta);
	}
	public void add(Naipe carta) {
		baraja.add(carta);
	}
	public void addAll(Mazo mazo) {
		for(int i=0; i<baraja.size();i++) {
			for(int j=0; j<mazo.getBaraja().size(); j++) {
				if(mazo.getNaipe(j).equals(baraja.get(i))) {
					baraja.remove(i);
				}
			}
		}
		for(int i=0; i<baraja.size();i++) {
			for(int j=0; j<mazo.getBaraja().size(); j++) {
				baraja.add(mazo.getNaipe(j));
			}
		}
		
	}
	@Override
	public String toString() {
		String text = "";
		for(int i=0; i<baraja.size();i++) {
			text += "--------------- NAIPE " + (i+1) + "-------------\n";
			text += baraja.get(i).toString() + "\n";
			
		}
		return text;
	}
	
}
