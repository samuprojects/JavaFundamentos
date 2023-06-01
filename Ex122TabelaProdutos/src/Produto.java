import java.text.NumberFormat;
import java.util.Locale;
import java.util.Objects;

public class Produto implements Comparable<Produto> {
	
	private static NumberFormat nf= NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
	
	private String nome;
	private double valor;
	
	public Produto(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getValor() {
		return valor;
	}
	
	public int compareTo(Produto p) {
		Double valor1 = Double.valueOf(this.valor);
		Double valor2 = Double.valueOf(p.valor);
		
		return valor1.compareTo(valor2);
	}
	
	public String toString() {
		return String.format("%-10s %7s", nome, nf.format(valor));
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(nome, other.nome);
	}

	
}
