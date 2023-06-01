
public class ContaBancaria {

	private double saldo;

	public void depositar(double valor) throws ValorInvalidoException {

		if (valor <= 0) {
			throw new ValorInvalidoException("Valor inválido para depósito ", valor);
		}

		saldo += valor;
	}

	public void sacar(double valor) throws SaldoInsuficienteException, ValorInvalidoException {

		if (valor <= 0) {
			throw new ValorInvalidoException("Valor inválido para saque ", valor);
		}

		if (saldo - valor < 0) {
			throw new SaldoInsuficienteException("Não há saldo suficiente disponível ", saldo);
		}

		saldo -= valor;
	}

	public void transferir(double valor, ContaBancaria conta)
			throws SaldoInsuficienteException, ValorInvalidoException {
		sacar(valor);
		conta.depositar(valor);
	}

}