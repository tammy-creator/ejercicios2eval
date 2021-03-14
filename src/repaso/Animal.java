package repaso;

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
		fecha = fecha.now();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
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
		LocalDate fechaHoy = LocalDate.now();
		Period edad = Period.between(fecha, fechaHoy);
		return "Nombre: " + nombre + " - Edad: " + edad.getYears() ;
	}
	
	
	
}
