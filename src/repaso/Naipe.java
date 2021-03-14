package repaso;



public class Naipe {
	private String palo;
	private String rango;
	private int valor;
	
	public Naipe(String palo, String rango, int valor) {
		this.palo = palo;
		this.rango = rango;
		this.valor = valor;
		
	}

	@Override
	public String toString() {
		return "Naipe [palo=" + palo + ", rango=" + rango + ", valor=" + valor + "]";
	}
	
	
}

