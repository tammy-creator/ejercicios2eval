package unidad5;

import java.util.ArrayList;

public class Entrenador {
	private String nombre;
	private int insignias;
	private ArrayList<Pokemon> pokemons =new ArrayList<>();
	
	public Entrenador(String nombre) {
		this.nombre = nombre;
		this.insignias = 0;
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

	public int getInsignias() {
		return insignias;
	}

	public void setInsignias(int insignias) {
		this.insignias = insignias;
	}

	public ArrayList<Pokemon> getPokemons() {
		return pokemons;
	}

	public void setPokemons(ArrayList<Pokemon> pokemons) {
		this.pokemons = pokemons;
	}

	@Override
	public String toString() {
		return nombre+ " "+ insignias + " "+ pokemons.size();
	}
	
	
}
