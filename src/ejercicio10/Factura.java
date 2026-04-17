package ejercicio10;


// clase padre
public class Factura {
	
	protected int numero;
	protected Cliente cliente; // usamos el tipo de dato objeto.
	protected double total;
	
	
	public Factura(int numero, Cliente cliente, double total) {
		super();
		this.numero = numero;
		this.cliente = cliente;
		this.total = total;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public double getTotal() {
		return total;
	}
	
	// validación
	public void setTotal(double total) {
		if(total<0) {
			throw new IllegalArgumentException("ERROR...TOTAL NEGATIVO");
		}
		this.total = total;
	}
	
	
	

	@Override
	public String toString() {
		return "NUMERO: " + numero + "\nCLIENTE: " + cliente + "\nTOTAL: " + total;
	}
	
	
	
	// METODO INICIAL DONDE VA A SALIR LA SOBRE ESCRITURA.
	public double calcularTotal() {
	
		return 0;
	}
	
	
	
	
	
	
	
	
	
	
	

}
