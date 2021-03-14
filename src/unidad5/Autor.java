package unidad5;

public class Autor {
	String nombre;
	String email;
	String genero;
	
	public Autor(String nombre, String email, String genero) {
		this.nombre = nombre;
		this.email = email;
		this.genero = genero;
	}

	public String getNombre() {
		return nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGenero() {
		return genero;
	}

	@Override
	public String toString() {
		return nombre+"("+genero+")"+email;
	}
	
	
	
	
}
