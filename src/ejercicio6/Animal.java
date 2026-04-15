package ejercicio6;

public class Animal {
	
	protected String nombre;
	protected String especie;
	protected String comer;
	
	
	public Animal(String nombre, String especie, String comer) {
		super();
		this.nombre = nombre;
		this.especie = especie;
		this.comer = comer;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getEspecie() {
		return especie;
	}


	public void setEspecie(String especie) {
		this.especie = especie;
	}


	public String getComer() {
		return comer;
	}


	public void setComer(String comer) {
		this.comer = comer;
	}


	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", especie=" + especie + ", comer=" + comer + "]";
	}
	
	
	
	
	
	public void hacerSonido() {
		System.out.println("HACER SONIDO");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
