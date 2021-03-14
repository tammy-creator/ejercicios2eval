package repaso;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hucha hucha = new Hucha(325);
		hucha.cambiarPassword("0000");
		hucha.abrirHucha("0000");
		System.out.println(hucha.toString());
		hucha.retirarCantidad(126);
		System.out.println(hucha.toString());
	}

}
