package unidad7;

public class Revista extends Biblioteca{
	private int numero;
	private String mesPublicacion;
	private int diaPublicacion;
	
	public Revista(int codigo, String titulo, int aņoPublicacion, int numero, String mesPublicacion,
			int diaPublicacion) {
		super(codigo, titulo, aņoPublicacion);
		this.numero = numero;
		this.mesPublicacion = mesPublicacion;
		this.diaPublicacion = diaPublicacion;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getMesPublicacion() {
		return mesPublicacion;
	}

	@Override
	public String toString() {
		return "Revista ["+codigo+" ,"+titulo+" ,"+aņoPublicacion+" ]";
	}
	
	
	
	
}