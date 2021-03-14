package unidad7;

public class Biblioteca {
		protected int codigo;
		protected String titulo;
		protected int a�oPublicacion;
		
		public Biblioteca(int codigo, String titulo, int a�oPublicacion) {
			super();
			this.codigo = codigo;
			this.titulo = titulo;
			this.a�oPublicacion = a�oPublicacion;
		}

		public int getCodigo() {
			return codigo;
		}

		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public int getA�oPublicacion() {
			return a�oPublicacion;
		}

		public void setA�oPublicacion(int a�oPublicacion) {
			this.a�oPublicacion = a�oPublicacion;
		}

		@Override
		public String toString() {
			return codigo+" ,"+titulo+" ,"+a�oPublicacion;
		}

	
}

