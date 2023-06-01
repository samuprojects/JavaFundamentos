import java.util.Locale;

public class Aplicacao {

	public static void main(String[] args) {

		Produto p1 = new Produto ("Feijão", 2.5, 4, 10, 2020);
		Produto p2 = new Produto ("Café", 1, 1, 1, 2022);
		Produto p3 = new Produto ("Beterraba", 0.9, 12, 11, 2017);
		
		Locale l = new Locale("pt", "BR");
		
		System.out.println(String.format(l, "%d) %12s %09.2f %s", 1, p1.getNome(), p1.getPeso(), p1.getFormattedDataValidade()));
		System.out.println(String.format(l, "%d) %12s %09.2f %s", 2, p2.getNome(), p2.getPeso(), p2.getFormattedDataValidade()));
		System.out.println(String.format(l, "%d) %12s %09.2f %s", 3, p3.getNome(), p3.getPeso(), p3.getFormattedDataValidade()));

	}

}
