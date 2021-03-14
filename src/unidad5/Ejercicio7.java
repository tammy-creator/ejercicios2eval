package unidad5;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce número de automoviles");
		String[] strParts;
		int n = teclado.nextInt();
		teclado.nextLine();
		Automovil[] coches = new Automovil[n];
		int contador=0;
		boolean repetido=false;
		System.out.println("Introduce datos: modelo+capac.depósito+lit.depósito+consumo");
		
		for(int i=0; i<n; i++) {
			repetido=false;
			strParts = teclado.nextLine().split("\\s");
			String modelo = strParts[0];
			for(int j=0; j<contador; j++) {
				if(modelo.equals(coches[j].getModelo())) {
					repetido=true;
					break;
				}
			}
			if(repetido==false) {
				coches[contador]=new Automovil(modelo,Integer.parseInt(strParts[1]),Integer.parseInt(strParts[2]),Float.parseFloat(strParts[3]));
				contador++;
			}
		}
		
		do {
			strParts = teclado.nextLine().split("\\s");
			if(strParts.length == 3 && strParts[0].equals("desplazar")) {
				for(int i=0; i<coches.length; i++) {
					if(coches[i].getModelo().equals(strParts[1])) {
						float gastado = coches[i].desplazar(Integer.parseInt(strParts[2]));
						if(gastado>0) {
							System.out.println(coches[i].getModelo()+" "+coches[i].getCantidad()+" "+coches[i].getCombustibleConsumido());
						}else {
							System.out.println("Combustible insuficiente para este desplazamiento");
						}
					}
				}
			}
			
		}while(!strParts[0].equals("fin"));
		
		System.out.println("-------------------------");
		for(Automovil c : coches) {
			System.out.println(c.getModelo()+" "+c.getCapacidad() + " " + c.getCantidad()+" "+c.getCombustibleConsumido());

		}
		
		
	}

}
