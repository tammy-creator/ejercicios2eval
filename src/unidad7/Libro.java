package unidad7;

public class Libro extends Biblioteca{
	private String nombreAutor;
	boolean prestado=false;
	
	public Libro(int codigo, String titulo, int a�oPublicacion, String nombreAutor) {
		super(codigo, titulo, a�oPublicacion);
		this.nombreAutor = nombreAutor;
		
	}

	public String getNombreAutor() {
		return nombreAutor;
	}

	public void setNombreAutor(String nombreAutor) {
		this.nombreAutor = nombreAutor;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	@Override
	public String toString() {
		return "Libro ["+codigo+" ,"+titulo+" ,"+a�oPublicacion+" ]";
	}
	
	
	
	
}