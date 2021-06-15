package repaso;

public class Frigorifico extends Electrodomestico {
	
	boolean noFrost = false;
	
	
	
	public Frigorifico(double precioBase, String color, char consumo, int peso, boolean noFrost) {
		super(precioBase, color, consumo, peso);
		this.noFrost = noFrost;
	}

	public Frigorifico(double precioBase, int peso) {
		super(precioBase, peso);
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return "Frigorifico, "+super.toString();
	}
}
