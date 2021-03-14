package unidad7;

public class Electrodomestico {
	protected int precioBase = 100;
	protected int color = 1;
	protected String consumo = "F";
	protected int peso = 5;
	protected double precioFinal;
	
	public Electrodomestico(int precioBase, int color, String consumo, int peso) {
		this.precioBase = precioBase;
		this.color = color;
		this.consumo = consumo;
		this.peso = peso;
		
	}
	
	public Electrodomestico(int peso, int precioFinal) {
		this.peso = peso;
		this.precioFinal = precioFinal;
	}
	
	public double PrecioFinal() {
		double porcentaje=0;
		switch (consumo) {
		case "A": porcentaje= 0.30;
			break;
		case "B": porcentaje= 0.25;
			break;
		case "C": porcentaje= 0.20;
			break;
		case "D": porcentaje= 0.15;
			break;
		case "E": porcentaje= 0.10;
			break;
		case "F": porcentaje= 0.05;
			break;
		}
		if(peso>0 && peso<=19) {
			porcentaje+=0.05;
		}else if(peso>19 && peso<=49){
			porcentaje+=0.10;
		}else if(peso>49 && peso<=79){
			porcentaje+=0.15;
		}else if(peso>79){
			porcentaje+=0.20;
		}
		return precioFinal = precioBase*porcentaje+precioBase;
	}

	public int getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public String getConsumo() {
		return consumo;
	}

	public void setConsumo(String consumo) {
		this.consumo = consumo;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public double getPrecioFinal() {
		return precioFinal;
	}

	public void setPrecioFinal(double precioFinal) {
		this.precioFinal = precioFinal;
	}

	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumo=" + consumo + ", peso="
				+ peso + ", precioFinal=" + precioFinal + "]";
	}
	
}
