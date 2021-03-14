package unidad7;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Electrodomestico[] electrodomesticos=new Electrodomestico[3];
		electrodomesticos[0]=new Lavadora(150,2,"B",25,9);
		electrodomesticos[1]=new Frigorifico(185,2,"A",52);
		electrodomesticos[2]=new Televisor(220,2,"C",15,50,"DVB-T");
		for(Electrodomestico e:electrodomesticos) {
			System.out.println(e.toString());
		}
		
		
	}

}
