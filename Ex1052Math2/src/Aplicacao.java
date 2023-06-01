
public class Aplicacao {

	public static void main(String[] args) {

		double valorSoma = Operacao.SOMA.calcular(10, 5);
		System.out.println(Operacao.SOMA + " -> " + valorSoma);

		double valorSubtracao = Operacao.SUBTRACAO.calcular(30, 10);
		System.out.println(Operacao.SUBTRACAO + " -> " + valorSubtracao);

		double valorMultiplicacao = Operacao.MULTIPLICACAO.calcular(9, 8);
		System.out.println(Operacao.MULTIPLICACAO + " -> " + valorMultiplicacao);

		double valorDivisao = Operacao.DIVISAO.calcular(7, 2);
		System.out.println(Operacao.DIVISAO + " -> " + valorDivisao);
	}
}