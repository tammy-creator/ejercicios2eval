package unidad6;

public class Mascota {
	private String nombre;
	private int energia = 20;
	private boolean estaViva = true;
	
	public Mascota(String nombre) {
		this.nombre = nombre;
	}
	
	public boolean isEstaViva() {
		return estaViva;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String dormir() {
		if(energia<5 || energia>50) {
			return "La mascota est� enferma y no puede dormir";
		}else{
			energia += 2;
			if(energia<47 && energia >8) {
				return "Alegr�a";
			}else if(energia>=47 && energia<=50 || energia>=5 && energia<=8) {
				return "Apat�a";
			}else if(energia>=50 && energia<=55 || energia>=0 && energia<=5) {
				return "Enferma";
			}else{
				estaViva=false;
				return "La mascota "+nombre+" ha muerto";
			}
		}
	}
		
	public String ejercicio() {
		if(energia<0 || energia>55) {
			return "La mascota "+nombre+" ha muerto";
		}
		if(energia<5 || energia>50) {
			return "La mascota est� enferma y no puede hacer ejercicio";
		}else {
			energia -= 3;
			if(energia<47 && energia >8) {
				return "Alegr�a";
			}else if(energia>=47 && energia<=50 || energia>=5 && energia<=8) {
				return "Apat�a";
			}else {
				return "Enferma";
			}
		}
	}
	
	public String comer() {
		if(energia<0 || energia>55) {
			return "La mascota "+nombre+" ha muerto";
		}		
		if(energia<5 || energia>50) {
			return "La mascota est� enferma y no puede comer";
		}else {
			energia += 5;
			if(energia<47 && energia >8) {
				return "Alegr�a";
			}else if(energia>=47 && energia<=50 || energia>=5 && energia<=8) {
				return "Apat�a";
			}else {
				return "Enferma";
			}
		}
	}
	
	public String curar() {
		if(energia<0 || energia>55) {
			return "La mascota "+nombre+" ha muerto";
		}
		if(energia>=5 && energia<=50) {
			return "La mascota est� sana y no hay que curarla";
		}else {
			energia = 20;
			return "La mascota est� curada";
		}
	}
	
}
