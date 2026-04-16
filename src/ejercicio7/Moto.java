package ejercicio7;

public class Moto extends Vehiculo {
	
	private int cilindrada;

	public Moto(String marca, double velocidad, int cilindrada) {
		super(marca, velocidad);
		this.cilindrada = cilindrada;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		return "Moto [cilindrada=" + cilindrada + "]";
	}

	
	
	@Override
	public void mostrarInfo() {
		// TODO Auto-generated method stub
		super.mostrarInfo();
		System.out.println("CILINDRADA: "+cilindrada);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
