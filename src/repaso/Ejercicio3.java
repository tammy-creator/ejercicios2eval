package repaso;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Autor autor = new Autor ("Alberto Fernández","afernandez@mail.com","masculino");
		System.out.println(autor.toString());
		autor.setEmail("albertof@mail.com");
		System.out.println(autor.getEmail());
	}

}
