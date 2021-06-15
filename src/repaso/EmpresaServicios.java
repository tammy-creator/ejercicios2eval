package repaso;

public class EmpresaServicios implements PagoServicios {
	private String nombre;
	private String servicio;
	private String numeroCta;
	
	public EmpresaServicios(String nombre, String servicio, String numeroCta) {
		super();
		this.nombre = nombre;
		this.servicio = servicio;
		this.numeroCta = numeroCta;
	}

	public String getNombre() {
		return nombre;
	}

	public String getServicio() {
		return servicio;
	}

	public String getNumeroCta() {
		return numeroCta;
	}

	public void setNumeroCta(String numeroCta) {
		this.numeroCta = numeroCta;
	}

	@Override
	public void realizarPago(double cantidad) {
		// TODO Auto-generated method stub
		System.out.println("Realizando pago de " + cantidad + "€ a " + getNombre() + " en calidad de empresa de servicios");
	}
	
	
	
}
