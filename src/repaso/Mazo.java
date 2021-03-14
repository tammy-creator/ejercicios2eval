package repaso;

import java.util.ArrayList;
import java.util.Random;

public class Mazo {
	private ArrayList<Naipe> baraja = new ArrayList<>();
	private ArrayList<Mazo> barajas = new ArrayList<>();

	public Mazo() {
		String[] palos = new String[]{"corazones","picas","diamantes","treboles"};
		String[] rango = new String[] {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		for(int i=0; i<palos.length;i++) {
			for(int j=0; j<rango.length;j++) {
				Naipe naipe = new Naipe(palos[i],rango[j],(j+1));
				baraja.add(naipe);
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

	public Naipe remove() {
		Random aleatorio = new Random();
		int carta = aleatorio.nextInt(baraja.size());
		return baraja.remove(carta)	;			
	}
	public void add(Naipe carta) {
		baraja.add(carta);	
	}

	@Override
	public String toString() {
		return "Mazo [naipes=" + baraja + "]";
	}
	
}
