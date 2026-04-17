package ejercicio10;

public class FacturaCredito extends Factura {
	
	private double recargo;
	private double cuotas;
	
	
	public FacturaCredito(int numero, Cliente cliente, double total, double recargo, double cuotas) {
		super(numero, cliente, total);
		this.recargo = recargo;
		this.cuotas = cuotas;
	}


	public double getRecargo() {
		return recargo;
	}


	public void setRecargo(double recargo) {
		this.recargo = recargo;
	}


	public double getCuotas() {
		return cuotas;
	}


	public void setCuotas(double cuotas) {
		this.cuotas = cuotas;
	}


	@Override
	public String toString() {
		return "RECARGO: " + recargo + "\nCUOTAS: " + cuotas;
	}


	@Override
	public double calcularTotal() {
		// TODO Auto-generated method stub
		return super.calcularTotal()+recargo;
	}


	
	
	
	

}
