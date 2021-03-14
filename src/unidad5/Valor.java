package unidad5;

public enum Valor {
	ACE(1), DOS(2), TRES(3), CUATRO(4), CINCO(5), SEIS(6), SIETE(7), OCHO(8), NUEVE(9), DIEZ(10), JACK(11), QUEEN(12), KING(13);
	private int valor;
	Valor(int i) {
		this.valor = i;
	}
	public int getValor() {
		return valor;
	}
}
