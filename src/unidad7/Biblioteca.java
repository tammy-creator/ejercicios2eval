package unidad7;

public class Biblioteca {
		protected int codigo;
		protected String titulo;
		protected int aņoPublicacion;
		
		public Biblioteca(int codigo, String titulo, int aņoPublicacion) {
			super();
			this.codigo = codigo;
			this.titulo = titulo;
			this.aņoPublicacion = aņoPublicacion;
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

		public int getAņoPublicacion() {
			return aņoPublicacion;
		}

		public void setAņoPublicacion(int aņoPublicacion) {
			this.aņoPublicacion = aņoPublicacion;
		}

		@Override
		public String toString() {
			return codigo+" ,"+titulo+" ,"+aņoPublicacion;
		}

	
}

