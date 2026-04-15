package ejercicio5;

public class Gerente extends Empleado{
	
	private double bonoadicional;

	public Gerente(String nombre, double salario, double bonoadicional) {
		super(nombre, salario);
		this.bonoadicional = bonoadicional;
	}

	public double getBonoadicional() {
		return bonoadicional;
	}

	public void setBonoadicional(double bonoadicional) {
		this.bonoadicional = bonoadicional;
	}

	@Override
	public String toString() {
		return "Gerente [bonoadicional=" + bonoadicional + "]";
	}

	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
	
		return salario + bonoadicional;
	}
	
	
	
	
	
	
	
	
	
	
	

}
