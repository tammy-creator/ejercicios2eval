package repaso;

import java.util.ArrayList;

public class PruebaEmpresas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<PagoServicios> trabajadores = new ArrayList<>();
		trabajadores.add(new Asalariado("Juan","Fernande","25/08/2018","1258-9652-58",1000));
		trabajadores.add(new Contratista("Fernando","Garcia","15/10/2020","1258-9856-85"));
		trabajadores.add(new EmpresaServicios("Telefonica","Telefonía","1258-9856-6352"));
		
		for(PagoServicios t: trabajadores) {
			double cantidad;
			if(t instanceof Asalariado) {
				cantidad = ((Asalariado) t).getSalario();
			}
			else if(t instanceof Contratista) {
				cantidad = 1000;
			}
			else {
				cantidad = 500;
			}
			t.realizarPago(cantidad);
		}
	}

}
