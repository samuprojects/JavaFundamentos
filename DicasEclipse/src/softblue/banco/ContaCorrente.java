package softblue.banco;

public class ContaCorrente extends Conta {

	@Override
	public void sacarValor(double valor) throws SaldoInsuficienteException {
		if(getSaldoDisponivel() - valor < 0) {
			throw new SaldoInsuficienteException("Saldo insuficiente");
		}
		setSaldoDisponivel(getSaldoDisponivel() - valor);
	}

	@Override
	public void depositar(double valor) {
		setSaldoDisponivel(getSaldoDisponivel() + valor);		
	}

}
