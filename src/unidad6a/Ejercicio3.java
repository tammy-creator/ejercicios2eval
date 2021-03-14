package unidad6a;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		String[] strParts = new String[2];
		int a=0;
		int b=0;
		double c=0;
	do {
		String entrada = teclado.nextLine();		
		strParts=entrada.split("\\s");
		
		
		if(strParts[0].equals("A")) {
			try{
				a = Integer.parseInt(strParts[1]);
			}catch(NumberFormatException e) {
				
			}
		}
		if(strParts[0].equals("B")) {
			try{
				b = Integer.parseInt(strParts[1]);
			}catch(NumberFormatException e) {
				
			}
		}
		if(strParts[0].equals("C")) {
			c = Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
			System.out.println(c);
			
		}
		
		
	}while(!strParts[0].equals("F"))	;
		
	}
	
}
