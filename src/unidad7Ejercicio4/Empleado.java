package unidad7Ejercicio4;

public class Empleado implements Comparable<Empleado> {
	protected String nombre;
	protected String apellidos;
	protected String fechaContratacion;
	protected String CuentaBanco;
	
	public Empleado(String nombre, String apellidos, String fechaContratacion, String cuentaBanco) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaContratacion = fechaContratacion;
		CuentaBanco = cuentaBanco;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getFechaContratacion() {
		return fechaContratacion;
	}

	public String getCuentaBanco() {
		return CuentaBanco;
	}

	public void setCuentaBanco(String cuentaBanco) {
		CuentaBanco = cuentaBanco;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellidos=" + apellidos + ", fechaContratacion=" + fechaContratacion
				+ ", CuentaBanco=" + CuentaBanco + "]";
	}

	public String cobro(int salario) {
		String mensaje="Empleado"+nombre+" ha sido efectuado el pago de su salario de importe: "+salario;
		return mensaje;
	}

	
	@Override
	public int compareTo(Empleado emp) {
		// TODO Auto-generated method stub
		return emp.getNombre().compareTo(this.nombre);
	}
	
	
}
