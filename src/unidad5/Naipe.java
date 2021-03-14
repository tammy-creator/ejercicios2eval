package unidad5;

public class Naipe {
	private Palo palo;
	private Valor valor;
	
	public Naipe(Palo palo, Valor valor) {
		this.palo = palo;
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Naipe [palo=" + palo + ", valor=" + valor.getValor() + "]";
	}
	
	
	
}
