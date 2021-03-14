package unidad5;

public class Automovil {
	private String modelo;
	private int capacidad;
	private int cantidad;
	private float consumo;
	private int kmRecorridos;
	private int combustibleConsumido;
	
	public Automovil(String modelo, int capacidad, int cantidad, float consumo) {
		
		this.modelo = modelo;
		this.capacidad = capacidad;
		this.cantidad = cantidad;
		this.consumo = consumo;
		this.kmRecorridos = 0;
		this.combustibleConsumido = 0;
	}

	public Automovil(String modelo, int capacidad, float consumo) {
		this.modelo = modelo;
		this.capacidad = capacidad;
		this.cantidad = capacidad;
		this.consumo = consumo;
		this.kmRecorridos = 0;
		this.combustibleConsumido = 0;
	}
	
	public void llenarDeposito() {
		this.cantidad=capacidad;
	}
	public int llenarDeposito(int litros) {
		if(litros>cantidad) {
			this.cantidad=capacidad;
			return litros-cantidad;
		}
		this.cantidad=litros;
		return 0;
	}
	
	public float desplazar(int km) {
		float litrosGastara=(km*consumo)/100;
		if(litrosGastara>cantidad) {
			cantidad-=litrosGastara;
			kmRecorridos+=km;
			combustibleConsumido+=litrosGastara;
			return cantidad;
		}else {
			return cantidad-litrosGastara;
		}
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}

	public void setKmRecorridos(int kmRecorridos) {
		this.kmRecorridos = kmRecorridos;
	}

	public String getModelo() {
		return modelo;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public int getCantidad() {
		return cantidad;
	}

	public float getConsumo() {
		return consumo;
	}

	public int getKmRecorridos() {
		return kmRecorridos;
	}

	public int getCombustibleConsumido() {
		return combustibleConsumido;
	}
	
	
}
