package unidad7Ejercicio5;

import java.util.ArrayList;

import repaso.Mazo;
import repaso.Naipe;

public class Blackjack {
	private static int numJugadores=1;
	private Mazo mazo = new Mazo();
	private ArrayList<Mano> manos = new ArrayList<>();
	
	public void repartir() {
		Mano crupier = new Mano();
		Mano jugador = new Mano();
		
		crupier.añadeCartaAleatoria();
		crupier.añadeCartaAleatoria();
		jugador.añadeCartaAleatoria();
		jugador.añadeCartaAleatoria();
		manos.add(crupier);
		manos.add(jugador);
		
	}
	public void mostrar() {
		Mano manoCrupier = manos.get(0);
		System.out.println("Mano del crupier:");
		System.out.println("Primera carta oculta");
		System.out.println(manoCrupier.getMano().get(1).toString());
		
		for(int i=1; i<manos.size(); i++) {
			Mano jugador = manos.get(i);
			System.out.println("Mano de jugador " + i);
			for(Naipe n: jugador.getMano()) {
				System.out.println(n.toString());
			}
		}
	}
	
}
