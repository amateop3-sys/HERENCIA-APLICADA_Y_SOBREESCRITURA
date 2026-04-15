package ejercicio2;

public class CuentaCorriente extends Cuenta {
	
	// CREO UN LIMITE PARA LA CUENTA
	private float limite;

	public CuentaCorriente(float saldo, float limite) {
		super(saldo);
		this.limite = limite;
	}

	
	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	



	@Override
	public String toString() {
		return "CuentaCorriente [limite=" + limite + ", saldo=" + saldo + ", getLimite()=" + getLimite()
				+ ", getSaldo()=" + getSaldo() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}


	// VALIDACIÓN
	@Override
	public void retirar(float monto) {
		// TODO Auto-generated method stub
		super.retirar(monto);
		if(saldo+limite>=monto) {
		}else{
			System.out.println("FONDO INSUFICIENTE.. ");
		}
	}
	
	

	

}
