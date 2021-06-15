package repaso;

import java.util.ArrayList;

public class SociedadAnonima {
	private String nombre;
	ArrayList<String> trabajos = new ArrayList<>();
	
	public SociedadAnonima(String nombre, ArrayList<String> trabajos) {
		super();
		this.nombre = nombre;
		this.trabajos = trabajos;
	}

	public String getNombre() {
		return nombre;
	}

	public ArrayList<String> getTrabajos() {
		return trabajos;
	}

	public void setTrabajos(ArrayList<String> trabajos) {
		this.trabajos = trabajos;
	}

	public void realizarPago(double cantidad) {
		// TODO Auto-generated method stub
		System.out.println("Realizando pago de " + cantidad + "€ a " + getNombre() + " en calidad de S.A");
	}
	
	
}
