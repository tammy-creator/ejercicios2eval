package unidad6;

public class Pokemon {
	private String nombre;
	private String elemento;
	private int salud;
	
	public Pokemon(String nombre, String elemento, int salud) {
		this.nombre = nombre;
		this.elemento = elemento;
		this.salud = salud;
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

	public int getSalud() {
		return salud;
	}

	public void setSalud(int salud) {
		this.salud = salud;
	}
	
}
