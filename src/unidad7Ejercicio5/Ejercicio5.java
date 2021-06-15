package unidad7Ejercicio5;

import java.util.Scanner;


public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String accion="";
		Blackjack juego = new Blackjack();
		do {
			System.out.print("Blackjack> ");
			accion = teclado.nextLine();
			switch(accion) {
				case "repartir": juego.repartir();
								 juego.mostrar();
								 break;
				case "pedir":
			}
			
		}while(!accion.equals("fin"));
		
	}

}
