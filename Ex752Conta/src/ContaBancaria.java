
public abstract class ContaBancaria {
	
	protected double saldo;
	
	public void depositar (double valor) {
		saldo += valor;
	}	
	public void sacar (double valor) {
		saldo -= valor;
	}	
	public void transferir (double valor, ContaBancaria conta) {
		
		sacar(valor);
		conta.depositar(valor);		
	}
	public abstract double calcularSaldo();
}
