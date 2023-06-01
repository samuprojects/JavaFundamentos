
public class Aplicacao {

	public static void main(String[] args) {
		
		double anguloConvertido = Matematica.converterAngulo(90.0, Matematica.TipoAngulo.GRAUS);
		System.out.println(anguloConvertido);
		
		anguloConvertido = Matematica.converterAngulo(1.57, Matematica.TipoAngulo.RADIANOS);
		System.out.println(anguloConvertido);
		
		int soma = Matematica.somar(10, 2, 4);
		System.out.println(soma);
		
		int valorDecimal = Matematica.converterBinarioParaDecimal("1011");
		System.out.println(valorDecimal);
		
	}

}
