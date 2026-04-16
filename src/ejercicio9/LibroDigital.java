package ejercicio9;

public class LibroDigital extends Libro{
	
	private Double TamañoEnMB;


	
	
	public LibroDigital(String titulo, String autor, Double tamañoEnMB) {
		super(titulo, autor);
		TamañoEnMB = tamañoEnMB;
	}




	public Double getTamañoEnMB() {
		return TamañoEnMB;
	}




	public void setTamañoEnMB(Double tamañoEnMB) {
		TamañoEnMB = tamañoEnMB;
	}




	@Override
	public String toString() {
		return "LibroDigital [TamañoEnMB=" + TamañoEnMB + "]";
	}




	@Override
	public void mostrarInfo() {
		// TODO Auto-generated method stub
		super.mostrarInfo();
		System.out.println("TAMAÑO EN MB: "+TamañoEnMB);
	}
	
	
	
	
	

}
