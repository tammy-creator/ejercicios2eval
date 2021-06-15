package repaso;

public class Asalariado extends Empleado {
	private double salario;

	public Asalariado(String nombre, String apellidos, String fechaContrato, String numeroCta, double salario) {
		super(nombre, apellidos, fechaContrato, numeroCta);
		this.salario = salario;
	}
	
	
	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public void realizarPago(double cantidad) {
		// TODO Auto-generated method stub
		System.out.println("Realizando pago de " + cantidad + "€ a " + getNombre() + " en calidad de asalariado");
	}
	
}
