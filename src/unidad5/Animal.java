package unidad5;

import java.time.LocalDate;
import java.time.Period;

public class Animal {
	private String nombre;
	private LocalDate fecha;
	public Animal(String nombre, LocalDate fecha) {
		
		this.nombre = nombre;
		this.fecha = fecha;
	}
	public Animal(String nombre) {
		
		this.nombre = nombre;
		this.fecha=LocalDate.now();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		if(nombre.equals("tamara")) {
			System.out.println("Tu estas tonto o que");
			this.nombre = "Gato";
			return;
		}
		this.nombre = nombre;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	@Override
	public String toString() {
		LocalDate fechaActual= LocalDate.now();
		Period edad = Period.between(fecha, fechaActual);
		String imprimir ="Nombre: "+this.nombre+" -Edad: "+edad.getYears();
		return imprimir;
	}
}
