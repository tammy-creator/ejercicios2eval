package unidad5;

public class Pokemon {
	private String nombre;
	private String elemento;
	private int puntoSalud;
	
	public Pokemon(String nombre, String elemento, int puntoSalud) {
		this.nombre = nombre;
		this.elemento = elemento;
		this.puntoSalud = puntoSalud;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getElemento() {
		return elemento;
	}

	public void setElemento(String elemento) {
		this.elemento = elemento;
	}

	public int getPuntoSalud() {
		return puntoSalud;
	}

	public void setPuntoSalud(int puntoSalud) {
		this.puntoSalud = puntoSalud;
	}
	
	
}
