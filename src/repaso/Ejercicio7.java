package repaso;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		int n=teclado.nextInt();
		teclado.nextLine();
		boolean repetido = false;
		ArrayList<Automovil> autos = new ArrayList<Automovil>();
		String[] datos = new String[n];
		
		do {
			String linea = teclado.nextLine();
			datos=linea.split("\\s");
			if(!datos[0].equals("desplazar") && !datos[0].equals("fin")) {
				if(autos.size()>0) {
					for(int i=0; i<autos.size(); i++) {
						if(autos.get(i).getModelo().equals(datos[0])) {
							repetido=true;
						}
					}
				}
				repetido=false;
				Automovil auto = new Automovil(datos[0],Integer.parseInt(datos[1]),Integer.parseInt(datos[2]),Integer.parseInt(datos[3]));
				autos.add(auto);
				
			}
			if(datos[0].equals("desplazar")){
				for(int i=0; i<autos.size(); i++) {
					if(datos[1].equals(autos.get(i).getModelo())) {
						autos.get(i).desplazar(Integer.parseInt(datos[2]));
					}
				}
			}
			
		}while(!datos[0].equals("fin"));
		
	}	

}
