package unidad6;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		ArrayList<Mascota> mascotas = new ArrayList<Mascota>();

		String[] strParts = new String[3];
		String[] partida = new String[]{
			"crear pepe",
			"ejercicio pepe",
			"ejercicio pepe",
			"ejercicio pepe",
			"ejercicio pepe",
			"ejercicio pepe",
			"ejercicio pepe",
			"ejercicio pepe",
			"ejercicio pepe",
		};
		for(String eleccion : partida) {
		//do {
			//String eleccion = teclado.nextLine();
			strParts = eleccion.split("\\s");
			boolean repetido = false;
			if(strParts[0].equals("crear")) {
				for (int i=0; i<mascotas.size();i++) {
					if(strParts[1].equals(mascotas.get(i).getNombre())) {
						System.out.println("La mascota introducida ya existe");
						repetido=true;
					}
				}
				if(repetido==false) {
					Mascota mascota = new Mascota(strParts[1]);	
					mascotas.add(mascota);
				}
			}
			int i =0;
			for(Mascota mascota: mascotas) {
				if(mascota.getNombre().equals(strParts[1])) {
					switch (strParts[0]) {
					case "comer": System.out.println(mascotas.get(i).comer());
						break;
					case "dormir": System.out.println(mascotas.get(i).dormir());
						break;
					case "ejercicio": System.out.println(mascotas.get(i).ejercicio());
						break;
					case "curar": System.out.println(mascotas.get(i).curar());
						break;
					case "salir": System.out.println("Adios");
					    break;
					}
				}else {
					System.out.println("La mascota no existe");
				}
				i++;
			}
		//}while(!strParts[0].equals("salir"));
		}
	}	
				

}
