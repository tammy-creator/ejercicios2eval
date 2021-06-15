package repaso;

public class Lavadora extends Electrodomestico {
	private int valorCarga=5;
	

	public Lavadora(double precioBase, String color, char consumo, int peso, int valorCarga) {
		super(precioBase, color, consumo, peso);
		this.valorCarga = valorCarga;
	}
	
	public Lavadora(double precioBase, int peso) {
		super(precioBase, peso);
		
	}
	
	public void calculaPrecioFinal() {
		if(valorCarga>8) {
			precioFinal += (precioFinal*0.1);
		}
	}
	
	public String toString() {
		return "Lavadora, "+super.toString();
	}
}
