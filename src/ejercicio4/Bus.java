package ejercicio4;

public class Bus extends Transporte{
	
	private String ruta;

	public Bus(int capacidad, String ruta) {
		super(capacidad);
		this.ruta = ruta;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	@Override
	public String toString() {
		return "Bus [ruta=" + ruta + "]";
	}

	@Override
	public void descripcion() {
		// TODO Auto-generated method stub
		super.descripcion();
		System.out.println("RUTA: "+ruta);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
