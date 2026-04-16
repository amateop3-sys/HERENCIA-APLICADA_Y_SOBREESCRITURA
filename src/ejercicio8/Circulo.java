package ejercicio8;

public class Circulo extends Figura{
	
	
	private double radio;

	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}

	
	
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return Math.PI *radio*radio; // math.pi es una constante que contiene el valor de pi.
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
