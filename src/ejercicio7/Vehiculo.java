package ejercicio7;

public class Vehiculo {
	
	protected String marca;
	protected double velocidad;
	
	
	public Vehiculo(String marca, double velocidad) {
		super();
		this.marca = marca;
		this.velocidad = velocidad;
	}


	
	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public double getVelocidad() {
		return velocidad;
	}


	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}



	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", velocidad=" + velocidad + "]";
	}
	
	
	
	// metodo mostrar
	public void mostrarInfo() {
		System.out.println("MARCA: "+marca);
		System.out.println("VELOCIDAD: "+velocidad);
		
	
	
	}
	
	

	
	
	

}
