package unidad6;

import java.util.ArrayList;


public class Entrenador {
	private String nombre;
	private ArrayList<Pokemon> pokemons = new ArrayList<>();
	private int insignias=0;
	
	public Entrenador(String nombre) {
		this.nombre = nombre;
		
	}
	public void addPokemon (Pokemon pokemon) {
		pokemons.add(pokemon);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Pokemon> getPokemons() {
		return pokemons;
	}

	public void setPokemons(ArrayList<Pokemon> pokemons) {
		this.pokemons = pokemons;
	}

	public int getInsignias() {
		return insignias;
	}

	public void setInsignias(int insignias) {
		this.insignias = insignias;
	}
	
	
}
