package unidad6a;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isInt("pepe"));
		System.out.println(isDouble("12.12"));
		
	}
	public static boolean isInt(String n) {
		try {
			int aux=Integer.parseInt(n);
			return true;
		}catch(NumberFormatException e) {
			return false;
		}
	}
	
	public static boolean isDouble(String n) {
		try {
			double aux=Double.parseDouble(n);
			return true;
		}catch(NumberFormatException e) {
		
			return false;
		}
		
	}

}

