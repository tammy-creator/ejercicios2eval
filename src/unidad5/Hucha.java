package unidad5;

public class Hucha {
	private int monedasuno;
	private int monedasdos;
	private int billetescinco;
	private int billetesdiez;
	private int billetesveinte;
	private int billetescincuenta;
	private String password = "contraseña";
	private boolean abierto=false;
	
	
	public Hucha() {
		this.monedasuno = 0;
		this.monedasdos = 0;
		this.billetescinco = 0;
		this.billetesdiez = 0;
		this.billetesveinte = 0;
		this.billetescincuenta = 0;
	}
	public Hucha(int cantidad) {
		while(cantidad >= 50) {
			billetescincuenta++;
			cantidad -= 50;
		}
		while(cantidad >= 20) {
			billetesveinte++;
			cantidad -= 20;
		}
		while(cantidad >= 10) {
			billetesdiez++;
			cantidad -= 10;
		}
		while(cantidad >= 5) {
			billetescinco++;
			cantidad -= 5;
		}
		while(cantidad >= 2) {
			monedasdos++;
			cantidad -= 2;
		}
		while(cantidad >= 1) {
			monedasuno++;
			cantidad -= 1;
		}
	}
	
	public Hucha(int monedasuno, int monedasdos, int billetescinco, int billetesdiez, int billetesveinte,
			int billetescincuenta) {
		this.monedasuno = monedasuno;
		this.monedasdos = monedasdos;
		this.billetescinco = billetescinco;
		this.billetesdiez = billetesdiez;
		this.billetesveinte = billetesveinte;
		this.billetescincuenta = billetescincuenta;
	}
	public boolean abrirCerrar(String password) {
		if(password==this.password) {
			if (abierto==true) {
				abierto=false;
			}else {
				abierto=true;
			}
			return abierto;
		}else {
			System.out.println("La contraseña es incorrecta");
			return abierto;
		}
		
	}
	public void cambiarPassword(String password) {
		this.password=password;
	}
	public String info() {
		int total = monedasuno+monedasdos*2+billetescinco*5+billetesdiez*10+billetesveinte*20+billetescincuenta*50;
		String imprimir = "La hucha tiene "+monedasuno+", "+monedasdos+", "+billetescinco+" ,"+billetesdiez+", "+billetesveinte+", "+billetescincuenta+"\n"+"La cantidad total que tienes en la hucha es: "+total+"€";
		return imprimir;
	}
	public void retirar(int tipo, int cantidad) {
		int retirado=0;
		if(abierto==false) {
			System.out.println("La hucha está cerrada, no puede retirar dinero");
			return;
		}
		if(tipo==1) {
			if(cantidad>monedasuno) {
				retirado=monedasuno;
				monedasuno=0;
			}else {
				retirado=cantidad*monedasuno;
				monedasuno=monedasuno-cantidad;
			}			
		}
		else if(tipo==2) {
			if(cantidad>monedasdos) {
				retirado=monedasdos;
				monedasdos=0;
			}else {
				retirado=cantidad*monedasdos;
				monedasdos=monedasdos-cantidad;
			}			
		}
		else if(tipo==5) {
			if(cantidad>billetescinco) {
				retirado=billetescinco;
				billetescinco=0;
			}else {
				retirado=cantidad*billetescinco;
				billetescinco=billetescinco-cantidad;
			}			
		}
		
		else if(tipo==10) {
			if(cantidad>billetesdiez) {
				retirado=billetesdiez;
				billetesdiez=0;
			}else {
				retirado=cantidad*billetesdiez;
				billetesdiez=billetesdiez-cantidad;
			}			
		}
		else if(tipo==20) {
			if(cantidad>billetesveinte) {
				retirado=billetesveinte;
				billetesveinte=0;
			}else {
				retirado=cantidad*billetesveinte;
				billetesveinte=billetesveinte-cantidad;
			}			
		}
		else if(tipo==50) {
			if(cantidad>billetescincuenta) {
				retirado=billetescincuenta;
				billetescincuenta=0;
			}else {
				retirado=cantidad*billetescincuenta;
				billetescincuenta=billetescincuenta-cantidad;
			}			
		}
		
	}
	public int retirarDirecto(int cantidad) {
		int retirar=0;
		while(cantidad >= 50 && billetescincuenta>0) {
			billetescincuenta--;
			retirar += 50;
			cantidad -= 50;
		}
		while(cantidad >= 20 && billetesveinte>0) {
			billetesveinte--;
			retirar += 20;
			cantidad -= 20;
		}
		while(cantidad >= 10 && billetesdiez>0) {
			billetesdiez--;
			retirar += 10;
			cantidad -= 10;
		}
		while(cantidad >= 5 && billetescinco>0) {
			billetescinco--;
			retirar += 5;
			cantidad -= 5;
		}
		while(cantidad >= 2 && monedasdos>0) {
			monedasdos--;
			retirar += 2;
			cantidad -= 2;
		}
		while(cantidad >= 1 && monedasuno>0) {
			monedasuno--;
			retirar += 1;
			cantidad -= 1;
		}
		return retirar;
	}
	
}

