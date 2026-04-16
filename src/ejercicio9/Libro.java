package ejercicio9;

public class Libro {
	
	protected String titulo;
	protected String autor;
	
	
	public Libro(String titulo, String autor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
	}
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + "]";
	}
	
	
	
	public void mostrarInfo() {
		System.out.println("TITULO: "+titulo);
		System.out.println("AUTOR: "+autor);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
