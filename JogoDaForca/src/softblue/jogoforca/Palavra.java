package softblue.jogoforca;

import java.util.HashSet;
import java.util.Set;

public class Palavra {

	private static final char CARACTERE_SECRETO = '_';

	private String palavraOriginal;

	private Set<Character> caracteresEncontrados = new HashSet<Character>();

	public Palavra(String palavraOriginal) {
		this.palavraOriginal = palavraOriginal.toUpperCase();
	}

	public String toString() {

		StringBuilder sb = new StringBuilder();

		char[] letrasArray = palavraOriginal.toCharArray();

		for (int i = 0; i < letrasArray.length; i++) {
			char c = letrasArray[i];

			if (caracteresEncontrados.contains(c)) {

				sb.append(c);
			} else {

				sb.append(CARACTERE_SECRETO);
			}

			sb.append(" ");
		}

		return sb.toString().trim();

	}

	public int tamanho() {
		return palavraOriginal.length();
	}

	public boolean possuiLetra(char letra) {

		if (palavraOriginal.indexOf(letra) > -1) {
			caracteresEncontrados.add(letra);
			return true;
		}

		return false;
	}

	public boolean acertouPalavra() {

		char[] letrasArray = palavraOriginal.toCharArray();

		Set<Character> letras = new HashSet<Character>();

		for (int i = 0; i < letrasArray.length; i++) {
			letras.add(letrasArray[i]);
		}

		return letras.equals(caracteresEncontrados);
	}

	public String getPalavraOriginal() {
		return palavraOriginal;
	}
}
