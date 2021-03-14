package unidad7;

public class Lavadora extends Electrodomestico {
	private int carga=5;

	public Lavadora(int precioBase, int color, String consumo, int peso, int carga) {
		super(precioBase, color, consumo, peso);
		this.carga = carga;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}
	
	@Override
	public double PrecioFinal() {
		// TODO Auto-generated method stub
		double precioFinal= super.PrecioFinal();
		if(carga>8) {
			precioFinal= (precioBase*0.1)+precioFinal;
		}
		return precioFinal;
	}

	@Override
	public String toString() {
		return "Lavadora: "+precioBase+" - "+color+" - "+consumo+" - "+peso+" - "+carga+" --- "+PrecioFinal();
	}
	
	
	
}
