
public class Aplicacao {

	public static void main(String[] args) {

		ContaBancaria c1 = new ContaBancaria();
		ContaBancaria c2 = new ContaBancaria();
		
		try {
			c1.depositar(100);
			System.out.println("Depósito de 100 feito com sucesso em c1");
		} catch (ValorInvalidoException e) {
			System.out.println("Erro: " + e.getMessage() + ". Valor inválido: " + e.getValorInvalido());
		}
		
		try {
			c1.depositar(-10);
			System.out.println("Depósito de -10 feito com sucesso em c1");
		} catch (ValorInvalidoException e) {
			System.out.println("Erro: " + e.getMessage() + ". Valor inválido: " + e.getValorInvalido());
		}
		
		try {
			c1.sacar(30);
			System.out.println("Saque de 30 feito com sucesso em c1");
		} catch (ValorInvalidoException e) {
			System.out.println("Erro: " + e.getMessage() + ". Valor inválido: " + e.getValorInvalido());
		} catch (SaldoInsuficienteException e) {
			System.out.println("Erro: " + e.getMessage() + ". Saldo disponível: " + e.getSaldoDisponivel());
		}
		
		try {
			c1.sacar(90);
			System.out.println("Saque de 90 feito com sucesso em c1");
		} catch (ValorInvalidoException e) {
			System.out.println("Erro: " + e.getMessage() + ". Valor inválido: " + e.getValorInvalido());
		} catch (SaldoInsuficienteException e) {
			System.out.println("Erro: " + e.getMessage() + ". Saldo disponível: " + e.getSaldoDisponivel());
		}
		
		try {
			c1.sacar(-5);
			System.out.println("Saque de -5 feito com sucesso em c1");
		} catch (ValorInvalidoException e) {
			System.out.println("Erro: " + e.getMessage() + ". Valor inválido: " + e.getValorInvalido());
		} catch (SaldoInsuficienteException e) {
			System.out.println("Erro: " + e.getMessage() + ". Saldo disponível: " + e.getSaldoDisponivel());
		}
		
		try {
			c1.transferir(50, c2);
			System.out.println("Transferência de 50 de c1 para c2 feita com sucesso");
		} catch (ValorInvalidoException e) {
			System.out.println("Erro: " + e.getMessage() + ". Valor inválido: " + e.getValorInvalido());
		} catch (SaldoInsuficienteException e) {
			System.out.println("Erro: " + e.getMessage() + ". Saldo disponível: " + e.getSaldoDisponivel());
		}
		
		try {
			c1.transferir(50, c2);
			System.out.println("Transferência de 50 de c1 para c2 feita com sucesso");
		} catch (ValorInvalidoException e) {
			System.out.println("Erro: " + e.getMessage() + ". Valor inválido: " + e.getValorInvalido());
		} catch (SaldoInsuficienteException e) {
			System.out.println("Erro: " + e.getMessage() + ". Saldo disponível: " + e.getSaldoDisponivel());
		}
	}
}