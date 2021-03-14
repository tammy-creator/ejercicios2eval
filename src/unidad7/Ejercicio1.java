package unidad7;

import unidad7.Biblioteca;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Biblioteca publicaciones[] = new Biblioteca[2];
		
		publicaciones[0]=new Libro(1002,"Cree en ti",2010,"Ruth Naves");
		publicaciones[1]= new Revista(1000,"Lecturas",2019,501,"Diciembre",25);
		
		for(Biblioteca publicacion: publicaciones) {
			System.out.println(publicacion.toString());
		}
	}
	
	
}
