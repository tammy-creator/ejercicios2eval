package repaso;

public class Electrodomestico {
	protected double precioBase=100;
	protected String color="Blanco";
	protected char consumo = 'F';
	protected int peso = 5;
	protected double precioFinal;
	
	public Electrodomestico(double precioBase, String color, char consumo, int peso) {
		super();
		this.precioBase = precioBase;
		this.color = color;
		this.consumo = consumo;
		this.peso = peso;
	}
	public Electrodomestico(double precioBase, int peso) {
		super();
		this.precioBase = precioBase;
		this.peso = peso;
	}
	public double getPrecioBase() {
		return precioBase;
	}
	public String getColor() {
		return color;
	}
	public char getConsumo() {
		return consumo;
	}
	public int getPeso() {
		return peso;
	}
	public double getPrecioFinal() {
		return precioFinal;
	}
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumo=" + consumo + ", peso="
				+ peso + ", precioFinal=" + precioFinal + "]";
	}
	
	public void calculaPrecioFinal() {
		double porcentajeConsumo=0;
		double porcentajePeso=0;
		
		switch (consumo) {
			case 'A': porcentajeConsumo=0.3;
				break;
			case 'B': porcentajeConsumo=0.25;
			break;
			case 'C': porcentajeConsumo=0.2;
			break;
			case 'D': porcentajeConsumo=0.15;
			break;
			case 'E': porcentajeConsumo=0.10;
			break;
			case 'F': porcentajeConsumo=0.05;
			break;
		}
		
		if(peso>=80) {
			porcentajePeso=0.2;
		}else if(peso>=50 || peso<80){
			porcentajePeso=0.15;
		}else if(peso>=20 || peso<50) {
			porcentajePeso=0.10;
		}else {
			porcentajePeso=0.05;
		}
		
		precioFinal=precioBase+(precioBase*porcentajeConsumo)+(precioBase*porcentajePeso);
	}
	
}
