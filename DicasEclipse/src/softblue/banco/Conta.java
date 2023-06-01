package softblue.banco;

public abstract class Conta {
	
	private double saldoDisponivel;
	
	public abstract void sacarValor(double valor) throws SaldoInsuficienteException;
	
	public abstract void depositar(double valor);
	
	public double getSaldoDisponivel() {
		return saldoDisponivel;
	}
	
	protected void setSaldoDisponivel(double saldo) {
		this.saldoDisponivel = saldo;
	}

}
