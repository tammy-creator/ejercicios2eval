package repaso;

public class Televisor extends Electrodomestico {
	int tamano = 20;
	String sintonizador = "DVB-T";
	
	
	public Televisor(double precioBase, String color, char consumo, int peso, int tamano, String sintonizador) {
		super(precioBase, color, consumo, peso);
		this.tamano = tamano;
		this.sintonizador = sintonizador;
	}


	public Televisor(double precioBase, int peso) {
		super(precioBase, peso);
		
	}
	
	public String toString() {
		return "Televisor, "+super.toString();
	}
}
