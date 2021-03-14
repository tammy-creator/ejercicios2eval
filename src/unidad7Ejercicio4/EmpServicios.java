package unidad7Ejercicio4;

import java.util.ArrayList;
import java.util.Date;

public class EmpServicios extends Empleado {
	private String tipoServicio;
	
	public EmpServicios(String nombre, String apellidos, String fechaContratacion, String cuentaBanco, String tipoServicio) {
		super(nombre, apellidos, fechaContratacion, cuentaBanco);
		this.tipoServicio = tipoServicio;
	}

	public String getTipoServicio() {
		return tipoServicio;
	}	
	
	public String cobro(int salario) {
		String mensaje="Tipo Empleado: Empresa Servicios \n"+nombre+" ha sido efectuado el pago de su servicio por importe de: "+salario;
		return mensaje;
	}

	@Override
	public String toString() {
		return "Tipo Empleado: EmpServicios [nombre=" + nombre + "]";
	}
	
}

