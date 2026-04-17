package ejercicio10;

public class FacturaContado extends Factura {
	
	private double descuento;

	public FacturaContado(int numero, Cliente cliente, double total, double descuento) {
		super(numero, cliente, total);
		this.descuento = descuento;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	@Override
	public String toString() {
		return "DESCUENTO: " + descuento;
	}

	
	
	@Override
	public double calcularTotal() {
		// TODO Auto-generated method stub
		return super.calcularTotal()- descuento; // Le restamos al total el descuento.
		
	}


	
	
	
	
	
	
	
	
	
	
	
	
	

}
