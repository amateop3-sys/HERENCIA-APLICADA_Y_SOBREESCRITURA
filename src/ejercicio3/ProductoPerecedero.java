package ejercicio3;

public class ProductoPerecedero extends Producto {
	
	private String fechaVencimiento;

	public ProductoPerecedero(String nombre, String fechaVencimiento) {
		super(nombre);
		this.fechaVencimiento = fechaVencimiento;
	}

	public String getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	@Override
	public String toString() {
		return "ProductoPerecedero [fechaVencimiento=" + fechaVencimiento + "]";
	}
	
	public void estaVencido() {
		System.out.println("FECHA: "+fechaVencimiento);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
