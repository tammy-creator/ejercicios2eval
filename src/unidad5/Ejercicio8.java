package unidad5;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio8 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		ArrayList<Entrenador> entrenadores = new ArrayList<Entrenador>();
		String partida1[] = new String[] {
			"Ash Charizard fuego 100",
			"Brock Squirtle agua 38",
			"Ash Pikacho electricidad 10",
			"torneo",
			"fuego",
			"electricidad",
			"fin"
		};
		String partida2[] = new String[] {
				"Misty Blastoise agua 18",
				"Clemont Pikacho electricidad 22",
				"Millo Kadabra psíquico 90",
				"torneo",
				"fuego",
				"electricidad",
				"fuego",
				"fin"
			};
		
		System.out.println("Comienza la partida");
		ArrayList<String> partida = new ArrayList<String>();
		String aux = "";
		do {
			aux=teclado.nextLine();
			partida.add(aux);
						
		}while(!aux.equals("fin"));		
		
		for(String linea:partida) {
			String[] strParts = linea.split("\\s");
			if(strParts.length == 4) {
				boolean repetido = false;
				Pokemon pok = new Pokemon(strParts[1],strParts[2],Integer.parseInt(strParts[3]));
				for(int i=0; i<entrenadores.size();i++) {
					Entrenador currentEntrenador = entrenadores.get(i);
					if(currentEntrenador.getNombre().equals(strParts[0])) {
						
						currentEntrenador.addPokemon(pok);
						//entrenadores.add(i, currentEntrenador);
						repetido = true;
					}
				}
				if(!repetido) {
					Entrenador e = new Entrenador(strParts[0]);
					e.addPokemon(pok);
					entrenadores.add(e);
				}
			}
			
			if(strParts.length == 1 && !strParts[0].equals("torneo") && !strParts[0].equals("fin")) {
				for(int i=0; i<entrenadores.size();i++) {
					boolean encontrado = false;
					for(Pokemon pokemon: entrenadores.get(i).getPokemons()) {
						if(pokemon.getElemento().equals(strParts[0])) {
							entrenadores.get(i).setInsignias(entrenadores.get(i).getInsignias()+1);
							encontrado=true;
							break;
						}
					}
					if(encontrado==false) {
						for(int j=0; j<entrenadores.get(i).getPokemons().size();j++) {
							if(entrenadores.get(i).getPokemons().get(j).getPuntoSalud()<10) {
								entrenadores.get(i).getPokemons().remove(j);
							}else {
								entrenadores.get(i).getPokemons().get(j).setPuntoSalud(entrenadores.get(i).getPokemons().get(j).getPuntoSalud()-10);
							}						
						}
					}
				}
			}
			if(strParts.length == 1 && strParts[0].equals("fin")) {
				for (Entrenador entrenador: entrenadores)
					System.out.println(entrenador.toString());
			}
		}
	
	}
	
	

}
