package unidad5;

import java.time.LocalDate;
import java.time.Month;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate fechaNacimiento = LocalDate.of(2019, Month.JULY, 1);
		Animal animal=new Animal("Gato",fechaNacimiento);
		System.out.println(animal.toString());
	}

}



