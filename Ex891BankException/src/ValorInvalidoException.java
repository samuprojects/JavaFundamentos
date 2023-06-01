
@SuppressWarnings("serial")
public class ValorInvalidoException extends Exception {

	private double valorInvalido;

	public ValorInvalidoException(String message, double valorInvalido) {
		super(message);

		this.valorInvalido = valorInvalido;
	}

	public double getValorInvalido() {
		return valorInvalido;
	}

}
