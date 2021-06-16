package repaso;


import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class ejerciciosRepaso1Eval {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/*BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			char [] v = in.readLine().toLowerCase().toCharArray();
			Arrays.sort(v);
			System.out.println(Arrays.toString(v));*/
		
		/*System.out.println(esBisiesto(1904));
		System.out.println(esBisiesto(1400));
		System.out.println(esBisiesto(1600));
		System.out.println(esBisiesto(1913));*/
		
		/*Scanner in = new Scanner(System.in);
		do {
			System.out.println("Introduce el valor de la variable:");
			double x = Double.parseDouble(in.nextLine());
			System.out.println("Introduce los coeficientes:");
			System.out.println("Resultado: " + evaluar(x, in.nextLine().split(" ")));
		} while (!fin(in));*/

		int [][] m = {
				{1, 5, 5, 2, 4},
				{2, 1, 4, 14, 3},
				{3, 7, 11, 2, 8},
				{4, 8, 12, 16, 4}
			};
			System.out.println(max3x3sum(m));
				
	}
	
	static boolean esBisiesto(int a) {
		boolean d4 = a % 4 == 0;
		boolean d100 = a % 100 == 0;
		boolean d400 = a % 400 == 0;
		return d4 && (!d100 || d400);
	}
	
	static double evaluar(double x, String [] coeficientes) {
		double resultado = Double.parseDouble(coeficientes[0]);
		for (int i=1; i<coeficientes.length; i++)
			resultado += Double.parseDouble(coeficientes[i]) * Math.pow(x, i);
		return resultado;
	}
	
	static boolean fin(Scanner in) throws IOException {
		String respuesta;
		boolean respuestaIncorrecta;
		do {
			System.out.println("¿Deseas evaluar otro polinomio? (si/no)");
			respuesta = in.nextLine();
			if (respuestaIncorrecta = !respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no"))
				System.out.println("Respuesta incorrecta.");
		} while (respuestaIncorrecta);
		return (respuesta.equalsIgnoreCase("no"));
	}
	
	static Integer max3x3sum(int [][] m) {
		if (m == null || m.length <= 3)
			return null;
		int c = m[0].length;
		if (c <= 3)
			return null;
		for (int i=1; i<m.length; i++)
			if (m[i].length != c)
				return null;
		
		int max = Integer.MIN_VALUE;
		
		for (int i=0; i<=m.length-3; i++)
			for (int j=0; j<=c-3; j++) {
				int resultado = 0;
				for (int k=i; k<i+3; k++)
					for(int l=j; l<j+3; l++)
						resultado += m[k][l];
				if (resultado > max)
					max = resultado;
			}
		return max;
	}
}
