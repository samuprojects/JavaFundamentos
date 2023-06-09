package softblue.banco;

import java.util.ArrayList;
import java.util.List;

public class Aplicacao {

	public static void main(String[] args) {

		Conta c1 = new ContaCorrente();
		c1.depositar(1000);
		try {
			c1.sacarValor(200);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}

		criarLista();
	}

	private static void criarLista() {
		List<ContaCorrente> lista = new ArrayList<>();
		lista.add(new ContaCorrente());
		lista.add(new ContaCorrente());
		lista.add(new ContaCorrente());

		for (ContaCorrente contaCorrente : lista) {
			System.out.println(contaCorrente.getSaldoDisponivel());
		}
	}

}
