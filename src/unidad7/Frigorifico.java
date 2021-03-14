package unidad7;

public class Frigorifico extends Electrodomestico {
	private boolean noFrost =false;

	public Frigorifico(int precioBase, int color, String consumo, int peso) {
		super(precioBase, color, consumo, peso);
		this.noFrost = noFrost;
	}

	public boolean isNoFrost() {
		return noFrost;
	}

	public void setNoFrost(boolean noFrost) {
		this.noFrost = noFrost;
	}

	@Override
	public String toString() {
		return "Frigorifico: "+precioBase+" - "+color+" - "+consumo+" - "+peso+" - "+noFrost+" --- "+PrecioFinal();
	}
	
	
	
}
