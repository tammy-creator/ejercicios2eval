package repaso;

public abstract class Empleado implements PagoServicios {
	private String nombre;
	private String apellidos;
	private String fechaContrato;
	private String numeroCta;
	
	public Empleado(String nombre, String apellidos, String fechaContrato, String numeroCta) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaContrato = fechaContrato;
		this.numeroCta = numeroCta;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getFechaContrato() {
		return fechaContrato;
	}

	public String getNumeroCta() {
		return numeroCta;
	}

	public void setNumeroCta(String numeroCta) {
		this.numeroCta = numeroCta;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellidos=" + apellidos + ", fechaContrato=" + fechaContrato
				+ ", numeroCta=" + numeroCta + "]";
	}

	public void realizarPago(double cantidad) {
		// TODO Auto-generated method stub
		System.out.println("Realizando pago de " + cantidad + "€ a " + getNombre() + " en calidad de empleado");
	}	
}
