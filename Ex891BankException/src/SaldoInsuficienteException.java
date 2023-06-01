
@SuppressWarnings("serial")
public class SaldoInsuficienteException extends Exception {
	
	private double saldoDisponivel;

	public SaldoInsuficienteException(String message, double saldoDisponivel) {
		
		super(message);
		
		this.saldoDisponivel = saldoDisponivel;
	}

	public double getSaldoDisponivel() {
		return saldoDisponivel;
	}
}
