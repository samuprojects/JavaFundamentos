
public enum Operacao {
	
	SOMA('+'),
	SUBTRACAO('-'),
	MULTIPLICACAO('X'),
	DIVISAO('/');
	
	private char c;
	
	Operacao(char c) {
		this.c = c;
	}
	
	public double calcular(double n1, double n2) {
		if (this == SOMA) {
			return n1 + n2;
		} else if (this == SUBTRACAO) {
			return n1 - n2;
		} else if (this == MULTIPLICACAO) {
			return n1 * n2;			
		} else if (this == DIVISAO) {
			return n1 / n2;
		} else {
			throw new UnsupportedOperationException("O cálculo não pode realizado");
		}
	}
	
	public String toString() {
		return String.valueOf(c);
	}
}