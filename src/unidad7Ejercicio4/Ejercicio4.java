package unidad7Ejercicio4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Empleado> empleados = new ArrayList<>();
		
		Empleado empleados1 = new Asalariado("Juan", "Fernandez García", "01/01/2010", "ES8900200004",1);
		empleados.add(empleados1);
		SociedadAnonima sociedad = new SociedadAnonima("Manuel y Hermanos, S.A", "Construcción");
		Empleado empleados2 = new Contratista("Domingo","Gonzalez Lopez","31/12/2020","ES25000000001",sociedad);
		empleados.add(empleados2);
		Empleado empleados3 = new EmpServicios("Pepa", "Gutierrez", "05/02/21", "ES05205040200602", "Limpieza");
		empleados.add(empleados3);
		List<Empleado> empleadOrdenado = Arrays.asList(empleados1, empleados2);
		/*Pago Nómina*/
		
		System.out.println(empleados.get(0).cobro(1000));
		System.out.println(empleados.get(1).cobro(2500));
		System.out.println(empleados.get(2).cobro(585));
		
		
		for(Empleado e: empleados) {
			System.out.println(e.toString());
		}
		
		Collections.sort(empleados,Collections.reverseOrder());
		for(Empleado e: empleados) {
			System.out.println(e.toString());
		}
	}

}
