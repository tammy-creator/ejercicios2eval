package repaso;

import java.util.ArrayList;

public class Contratista extends Empleado {
	ArrayList<SociedadAnonima> empresas = new ArrayList<>();

	public Contratista(String nombre, String apellidos, String fechaContrato, String numeroCta) {
		super(nombre, apellidos, fechaContrato, numeroCta);
		
	}

	public ArrayList<SociedadAnonima> getEmpresas() {
		return empresas;
	}

	public void setEmpresas(ArrayList<SociedadAnonima> empresas) {
		this.empresas = empresas;
	}

	@Override
	public void realizarPago(double cantidad) {
		// TODO Auto-generated method stub
		System.out.println("Realizando pago de " + cantidad + "€ a " + getNombre() + " en calidad de contratista");
	}
	
	
}
