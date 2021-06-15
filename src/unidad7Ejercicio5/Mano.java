package unidad7Ejercicio5;

import java.util.ArrayList;

import repaso.Mazo;
import repaso.Naipe;

public class Mano extends Mazo {
	private ArrayList<Naipe> mano = new ArrayList<>();

	public Mano() {
		super();
		
	}
	
	public void añadeCartaAleatoria() {
		mano.add(super.get());
	}

	public ArrayList<Naipe> getMano() {
		return mano;
	}

	public void setMano(ArrayList<Naipe> mano) {
		this.mano = mano;
	}
	
}
