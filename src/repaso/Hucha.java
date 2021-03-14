package repaso;

public class Hucha {
	private int monedasUno;
	private int monedasDos;
	private int billetesCinco;
	private int billetesDiez;
	private int billetesVeinte;
	private int billetesCincuenta;
	private boolean abierta;
	private String password;
	
	public Hucha(int monedasUno, int monedasDos, int billetesCinco, int billetesDiez, int billetesVeinte,
			int billetesCincuenta, boolean abierta, String password) {
		this.monedasUno = monedasUno;
		this.monedasDos = monedasDos;
		this.billetesCinco = billetesCinco;
		this.billetesDiez = billetesDiez;
		this.billetesVeinte = billetesVeinte;
		this.billetesCincuenta = billetesCincuenta;
		this.abierta = abierta;
		this.password = password;
	}
	
	public Hucha() {
		this.monedasUno = 0;
		this.monedasDos = 0;
		this.billetesCinco = 0;
		this.billetesDiez = 0;
		this.billetesVeinte = 0;
		this.billetesCincuenta = 0;
		this.abierta = abierta;
		this.password ="";
	}
	
	public Hucha(int cantidadInicial) {
		int aux=0;
		if(cantidadInicial>=50) {
			aux=(cantidadInicial/50);
			billetesCincuenta+=aux;
			cantidadInicial-=aux*50;
			aux=0;
		}else {
			billetesCincuenta=0;
		}
		if(cantidadInicial>=20) {
			aux=(cantidadInicial/20);
			billetesVeinte+=aux;
			cantidadInicial-=aux*20;
			aux=0;
		}else {
			billetesVeinte=0;
		}
		if(cantidadInicial>=10) {
			aux=(cantidadInicial/10);
			billetesDiez+=aux;
			cantidadInicial-=aux*10;
			aux=0;
		}else {
			billetesDiez=0;
		}
		if(cantidadInicial>=5) {
			aux=(cantidadInicial/5);
			billetesCinco+=aux;
			cantidadInicial-=aux*5;
			aux=0;
		}else {
			billetesCinco=0;
		}
		if(cantidadInicial>=2) {
			aux=(cantidadInicial/2);
			monedasDos+=aux;
			cantidadInicial-=aux*2;
			aux=0;
		}else {
			monedasDos=0;
		}
		if(cantidadInicial>=1) {
			aux=(cantidadInicial/1);
			monedasUno+=aux;
			cantidadInicial-=aux*1;
			aux=0;
		}else {
			monedasUno=0;
		}
	}
	

	@Override
	public String toString() {
		return "Hucha [monedasUno=" + monedasUno + ", monedasDos=" + monedasDos + ", billetesCinco=" + billetesCinco
				+ ", billetesDiez=" + billetesDiez + ", billetesVeinte=" + billetesVeinte + ", billetesCincuenta="
				+ billetesCincuenta + ", abierta=" + abierta + "]";
	}
	
	public String retirar(int cantidadRetirar, int tipo) {
		String info="";
		switch(tipo) {
		case 1:if(monedasUno>=cantidadRetirar) {
					monedasUno-=cantidadRetirar;
					info="Cantidad retirada correctamente, le quedan:"+monedasUno+" monedas de 1€";
				}else {
					info="no había suficientes monedas, solo se pueden retirar: "+monedasUno;
				}
				break;
		case 2:if(monedasDos>=cantidadRetirar) {
					monedasDos-=cantidadRetirar;
					info="Cantidad retirada correctamente, le quedan:"+monedasDos+" monedas de 2€";
				}else {
					info="no había suficientes monedas, solo se pueden retirar: "+monedasDos;
				}
				break;
		case 3:if(billetesCinco>=cantidadRetirar) {
					billetesCinco-=cantidadRetirar;
					info="Cantidad retirada correctamente, le quedan:"+billetesCinco+" billetes de 5€";
				}else {
					info="no había suficientes monedas, solo se pueden retirar: "+billetesCinco;
				}	
			break;
		case 4:if(billetesDiez>=cantidadRetirar) {
					billetesDiez-=cantidadRetirar;
					info="Cantidad retirada correctamente, le quedan:"+billetesDiez+" billetes de 10€";
				}else {
					info="no había suficientes monedas, solo se pueden retirar: "+billetesDiez;
				}	
			break;
		case 5:if(billetesVeinte>=cantidadRetirar) {
					billetesVeinte-=cantidadRetirar;
					info="Cantidad retirada correctamente, le quedan:"+billetesVeinte+" billetes de 20€";
				}else {
					info="no había suficientes monedas, solo se pueden retirar: "+billetesVeinte;
				}	
			break;
		case 6:if(billetesCincuenta>=cantidadRetirar) {
					billetesCincuenta-=cantidadRetirar;
					info="Cantidad retirada correctamente, le quedan:"+billetesCincuenta+" billetes de 50€";
				}else {
					info="no había suficientes monedas, solo se pueden retirar: "+billetesCincuenta;
				}
			break;
		}
		return info;
		
	}
	public String retirarCantidad(int cantidadRetirar) {
		int aux=0;
		String info ="";
		int totalHucha = monedasUno+monedasDos*2+billetesCinco*5+billetesDiez*10+billetesVeinte*20+billetesCincuenta*50;
		
		if(cantidadRetirar>totalHucha) {
			billetesCincuenta=0;
			billetesVeinte=0;
			billetesDiez=0;
			billetesCinco=0;
			monedasDos=0;
			monedasUno=0;
			info="No hay fondos suficientes, se retira el total de la Hucha: "+totalHucha;
		}else {
			if(cantidadRetirar>=50 && billetesCincuenta>0) {
				aux=(cantidadRetirar/50);
				if(billetesCincuenta>aux) {
					billetesCincuenta-=aux;
					cantidadRetirar-=aux*50;
				}else {
					billetesCincuenta=0;
					cantidadRetirar-=billetesCincuenta*50;
				}
			}
			if(cantidadRetirar>=20 && billetesVeinte>0) {
				aux=(cantidadRetirar/20);
				if(billetesVeinte>aux) {
					billetesVeinte-=aux;
					cantidadRetirar-=aux*20;
				}else {
					billetesVeinte=0;
					cantidadRetirar-=billetesVeinte*20;
				}
			}
			if(cantidadRetirar>=10 && billetesDiez>0) {
				aux=(cantidadRetirar/10);
				if(billetesDiez>aux) {
					billetesDiez-=aux;
					cantidadRetirar-=aux*10;
				}else {
					billetesDiez=0;
					cantidadRetirar-=billetesDiez*10;
				}
			}
			if(cantidadRetirar>=5 && billetesCinco>0) {
				aux=(cantidadRetirar/5);
				if(billetesCinco>aux) {
					billetesCinco-=aux;
					cantidadRetirar-=aux*5;
				}else {
					billetesCinco=0;
					cantidadRetirar-=billetesCinco*5;
				}
			}
			if(cantidadRetirar>=2 && monedasDos>0) {
				aux=(cantidadRetirar/2);
				if(monedasDos>aux) {
					monedasDos-=aux;
					cantidadRetirar-=aux*2;
				}else {
					monedasDos=0;
					cantidadRetirar-=monedasDos*2;
				}
			}
			if(cantidadRetirar>=1 && monedasUno>0) {
				aux=(cantidadRetirar/1);
				if(monedasUno>aux) {
					monedasUno-=aux;
					cantidadRetirar-=aux;
				}else {
					monedasUno=0;
					cantidadRetirar-=monedasUno;
				}
			}
			info="fondos retirados correctamente";
		}
		
		
		return info;
	}
	
	public void cambiarPassword (String passwordNueva) {
		password = passwordNueva;
	}
	
	public String abrirHucha (String password) {
		if(password==this.password) {
			abierta=true;
			return "La hucha esta abierta";
		}else {
			abierta=false;
			return "La contraseña no es correcta";			
		}		
	}
	
	public String cerrarHucha() {
		if(abierta == true) {
			abierta=false;
		}
		return "La hucha esta cerrada";
	}
	
}
