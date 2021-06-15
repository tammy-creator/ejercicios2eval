package repaso;

import java.util.Arrays;

public class MetodosOrdenacion {

	public static void insercionDirecta(int [] v) {
		 int aux;
		    for (int i = 1; i < v.length; i++){ 		// desde el segundo elemento hasta
		              aux = v[i]; 						// el final, guardamos el elemento y
		              int j = i - 1; 					// empezamos a comprobar con el anterior
		              while ((j >= 0) && (aux < v[j])){ // mientras queden posiciones y el
		                                                // valor de aux sea menor que los
		                             v[j + 1] = v[j];   // de la izquierda, se desplaza a
		                             j--;               // la derecha
		              }
		              v[j + 1] = aux; 					// colocamos aux en su sitio
		    }
	}
	
	public static void seleccionDirecta(int [] v) {
		int menor, pos,tmp;
		for(int i=0; i<v.length; i++) {			// tomamos como menor el primero
			menor=v[i];							// de los elementos que quedan por ordenar
			pos = i;							// y guardamos su posición
			for(int j=i+1; j<v.length; j++) {   // buscamos en el resto
				if(v[j]<menor) {				// del array algún elemento
					menor = v[j];				// menor que el actual
					pos=j;						
				}								
			}									
			if(pos!=i) {						// si hay alguno menor se intercambia
				tmp = v[i];						
				v[i]=v[pos];
				v[pos]= tmp;
			}
		}
	}
	
	public static void intercambioDirecto(int [] v) { //método burbuja
		int tmp;
		for(int i=1; i<v.length; i++) {
			for(int j=v.length-1; j>=i; j--) {
				if(v[j]<v[j-1]) {
					tmp = v[j];
					v[j] = v[j-1];
					v[j-1]=tmp;
				}
			}
		}
	}
		
	public static void main(String[] args) {
		int [] v = {2, 5, 9, 1, 14, 21, 7, 33, 8};
		insercionDirecta(v);
		System.out.println(Arrays.toString(v));
	}
}
