package repaso;

import java.util.Collection;

public class Libro {
	private String titulo;
	private Collection<Autor> autores;
	private float precio;
	private int stock;
	
	public Libro(String titulo, Collection<Autor> autores, float precio) {
		this.titulo = titulo;
		this.autores = autores;
		this.precio = precio;
	}

	public String getTitulo() {
		return titulo;
	}

	public Collection<Autor> getAutores() {
		return autores;
	}

	public float getPrecio() {
		return precio;
	}

	public int getStock() {
		return stock;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return titulo+" ("+autores.toString()+") "+precio+"€ -"+stock+" unidades en stock";
	}
	
	
}
