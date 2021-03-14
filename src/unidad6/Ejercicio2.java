package unidad6;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String[]strParts=new String[4];
		String partida = "";
		
		ArrayList <Pokemon> pokemons =new ArrayList<>();
		ArrayList <Entrenador> entrenadores =new ArrayList<>();
		do {
			partida = teclado.nextLine();
			strParts=partida.split("\\s");
			if(strParts.length>1) {
				boolean repetido = false;
				Pokemon pokemon = new Pokemon(strParts[1],strParts[2],Integer.parseInt(strParts[3]));
				
				for(int i=0; i<entrenadores.size();i++) {
					if(strParts[0].equals(entrenadores.get(i).getNombre())) {
						repetido=true;
						pokemons.add(pokemon);
						entrenadores.get(i).addPokemon(pokemon);
					}
				}
				if(repetido==false) {
					Entrenador entrenador = new Entrenador(strParts[0]);
					entrenador.addPokemon(pokemon);
					entrenadores.add(entrenador);
				}
			}
		}while(!strParts[0].equals("torneo"));
		
		do {
			partida = teclado.nextLine();
			strParts=partida.split("\\s");
			if(strParts.length==1 && !strParts[0].equals("torneo")) {
				for(int i=0; i<entrenadores.size();i++) {
					for(int j=0; j<entrenadores.get(i).getPokemons().size();j++) {
						if(strParts[0].equals(entrenadores.get(i).getPokemons().get(j).getElemento())){
							int insignias = entrenadores.get(i).getInsignias()+1;
							entrenadores.get(i).setInsignias(insignias);
							
						}else {
							int salud = entrenadores.get(i).getPokemons().get(j).getSalud()-10;
							entrenadores.get(i).getPokemons().get(i).setSalud(salud);
							if(salud<=0) {
								pokemons.remove(j);
							}
						}
						
					}
					
				}
			}
		}while(!strParts[0].equals("fin"));
		for(Entrenador entrenador:entrenadores) {
			System.out.println(entrenador.getNombre()+" "+entrenador.getInsignias()+" "+entrenador.getPokemons().size());
		}
	}
}
