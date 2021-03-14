package unidad7;

public class Televisor extends Electrodomestico {
	private int pulgadas=20;
	private String sintonizador="DVB-T";
	
	public Televisor(int precioBase, int color, String consumo, int peso, int pulgadas,
			String sintonizador) {
		super(precioBase, color, consumo, peso);
		this.pulgadas = pulgadas;
		this.sintonizador = sintonizador;
	}

	public int getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}

	public String getSintonizador() {
		return sintonizador;
	}

	public void setSintonizador(String sintonizador) {
		this.sintonizador = sintonizador;
	}

	@Override
	public String toString() {
		return "Televisor: "+precioBase+" - "+color+" - "+consumo+" - "+peso+" - "+pulgadas+" --- "+PrecioFinal();
	}
	
	
}
