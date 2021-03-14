package unidad6a;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			double[] solucion = ecuacion(1,5,1);
			System.out.println(solucion[0]+" "+solucion[1]);
			
		}catch(IllegalArgumentException e) {
			System.out.println("no es una ecuación de segundo grado");
		}catch(ArithmeticException e) {
			System.out.println("la ecuación no tiene una solución real");
		}
	}
	public static double[] ecuacion(double a, double b, double c) {
		double[]solucion = new double[2];
		if(a==0) {
			throw new IllegalArgumentException();
		}
		double raizSolucion = Math.pow(b, 2)-(4*a*c);
		if(raizSolucion<0) {
			throw new ArithmeticException();
		}
		double solucion1 = (-b+Math.sqrt(raizSolucion)/(2*a));
		double solucion2 = (-b-Math.sqrt(raizSolucion)/(2*a));
		solucion[0]=solucion1;
		solucion[1]=solucion2;
		return solucion;
	}
}
