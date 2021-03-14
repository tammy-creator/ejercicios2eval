package unidad7Ejercicio4;

import java.util.ArrayList;

public class Contratista extends Empleado {
	private ArrayList<SociedadAnonima> sociedades;

	public Contratista(String nombre, String apellidos, String fechaContratacion, String cuentaBanco,
			SociedadAnonima sociedad) {
		super(nombre, apellidos, fechaContratacion, cuentaBanco);
		this.sociedades = sociedades;
	}
	
	public String cobro(int salario) {
		String mensaje = "Tipo Empleado: Contratista \n"+super.cobro(salario);
		return mensaje;
		//String mensaje="Tipo Empleado: Contratista <\n>"+nombre+" ha sido efectuado el pago de su salario de importe: "+salario;
		//return mensaje;
	}

	@Override
	public String toString() {
		return "Tipo Empleado: Contratista [nombre=" + nombre + "]";
	}

	
}
