package repaso;

public class Automovil {
	private String modelo;
	private int capacidadDeposito;
	private int combustibleDeposito;
	private int consumo;
	private int kmRecorridos=0;
	private int combustibleConsumido=0;
	
	public Automovil(String modelo, int capacidadDeposito, int combustibleDeposito, int consumo) {
		this.modelo = modelo;
		this.capacidadDeposito = capacidadDeposito;
		this.combustibleDeposito = combustibleDeposito;
		this.consumo = consumo;
	}
	
	public Automovil(String modelo, int capacidadDeposito, int consumo) {
		this.modelo = modelo;
		this.capacidadDeposito = capacidadDeposito;
		this.combustibleDeposito = capacidadDeposito;
		this.consumo = consumo;
	}
		
	public String getModelo() {
		return modelo;
	}

	public int getCapacidadDeposito() {
		return capacidadDeposito;
	}

	public int getCombustibleDeposito() {
		return combustibleDeposito;
	}

	public int getConsumo() {
		return consumo;
	}

	public int getKmRecorridos() {
		return kmRecorridos;
	}

	public int getCombustibleConsumido() {
		return combustibleConsumido;
	}

	public void setCombustibleDeposito(int combustibleDeposito) {
		this.combustibleDeposito = combustibleDeposito;
	}

	public void setCombustibleConsumido(int combustibleConsumido) {
		this.combustibleConsumido = combustibleConsumido;
	}

	public void llenarDeposito(){
		int litrosLlenar = capacidadDeposito-combustibleDeposito;
		combustibleDeposito += litrosLlenar;
		System.out.println("El depóisto se ha llenado con "+ litrosLlenar+" litros");
	}
	public void llenarDeposito(int cantidad) {
		int aux=0;
		if(cantidad>(capacidadDeposito-combustibleDeposito)) {
			aux=cantidad-combustibleDeposito;
			combustibleDeposito=capacidadDeposito;	
			System.out.println("El deposito se ha llenado y han sobrado "+aux+"litros");
		}else {
			combustibleDeposito+=cantidad;
			System.out.println("El deposito no se ha llenado, tiene "+combustibleDeposito+" litros en el depósito");
		}
	}
	public void desplazar(int kmRecorrer) {
		int litrosconsumo = kmRecorrer*consumo;
		
		if(combustibleDeposito>=litrosconsumo) {
			combustibleDeposito-=litrosconsumo;
			combustibleConsumido+=litrosconsumo;
			kmRecorridos+=kmRecorrer;
			System.out.println("ha realizado "+kmRecorrer+" y ha consumido "+litrosconsumo+" litros");
		}else {
			int km=combustibleDeposito/consumo;			
			kmRecorridos+=kmRecorrer;
			combustibleConsumido+=combustibleDeposito;
			combustibleDeposito=0;
			System.out.println("Con el combustible que tiene, solo ha podido recorrer "+km+ " km");
		}
	}
	
	
	
	
	
	
	
}
