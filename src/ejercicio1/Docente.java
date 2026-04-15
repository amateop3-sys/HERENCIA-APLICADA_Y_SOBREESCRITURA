package ejercicio1;

public class Docente extends Persona{
	
	private String especialidad;

	public Docente(String nombre, int edad, String especialidad) {
		super(nombre, edad);
		this.especialidad = especialidad;
	}

	
	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}


	

	@Override
	public String toString() {
		return "Docente [especialidad=" + especialidad + ", nombre=" + nombre + ", edad=" + edad
				+ ", getEspecialidad()=" + getEspecialidad() + ", getNombre()=" + getNombre() + ", getEdad()="
				+ getEdad() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}


	// sobreescritura de metodo mostrar
	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		super.mostrar();
		System.out.println("ESPECIALIDAD: "+especialidad);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
