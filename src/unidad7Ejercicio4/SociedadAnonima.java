package unidad7Ejercicio4;

import java.util.ArrayList;

public class SociedadAnonima{
	private String nombreSociedad;
	private String especialidad;
	
	public SociedadAnonima(String nombreSociedad, String especialidad) {
		this.nombreSociedad = nombreSociedad;
		this.especialidad = especialidad;
	}

	public String getNombreSociedad() {
		return nombreSociedad;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	
	
}
