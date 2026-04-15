package ejercicio6;

public class Perro extends Animal{

	public Perro(String nombre, String especie, String comer) {
		super(nombre, especie, comer);
	}

	@Override
	public void hacerSonido() {
		// TODO Auto-generated method stub
		// ELIMINE EL SUPER PORQUE AL EJECUTAR ESTABA LLAMANDO AL METODO DE LA CLASE PADRE
		System.out.println("LADRAR");
	}
	
	
	
	
	
	
	
	
	
	

}
