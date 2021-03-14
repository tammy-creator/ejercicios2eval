package unidad7Ejercicio4;

public class Asalariado extends Empleado {
	private int codigoEmpAsa;

	public Asalariado(String nombre, String apellidos, String fechaContratacion, String cuentaBanco, int codigoEmpAsa) {
		super(nombre, apellidos, fechaContratacion, cuentaBanco);
		this.codigoEmpAsa = codigoEmpAsa;
	}
	
	public String cobro(int salario) {
		String mensaje="Tipo Empleado: Asalariado \n"+nombre+" ha sido efectuado el pago de su salario de importe: "+salario;
		return mensaje;
	}

	@Override
	public String toString() {
		return "Tipo Empleado:Asalariado [Nombre=" + nombre + "]";
	}
	
	
}
