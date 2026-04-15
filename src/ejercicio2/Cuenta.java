package ejercicio2;

public class Cuenta {
	
	protected float saldo;


	
	public Cuenta(float saldo) {
		super();
		this.saldo = saldo;
	}

	


	public float getSaldo() {
		return saldo;
	}




	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}





	

	@Override
	public String toString() {
		return "Cuenta [saldo=" + saldo + ", getSaldo()=" + getSaldo() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}




	public void retirar(float monto) {
		saldo-=monto;
	}
	

}
