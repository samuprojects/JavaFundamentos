package softblue.jogoforca;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import softblue.jogoforca.utils.RandomUtils;

public class Dicionario {

	private static final String ARQUIVO_DICIONARIO = "dicionario.txt";

	private static Dicionario instance;

	private List<String> palavras = new ArrayList<String>();

	private Dicionario() {

		carregarPalavras();
	}

	public static Dicionario getInstance() {
		if (instance == null) {
			instance = new Dicionario();
		}
		return instance;
	}

	private void carregarPalavras() {

		Scanner scanner = null;

		try {
			scanner = new Scanner(new File(ARQUIVO_DICIONARIO));

			while (scanner.hasNextLine()) {
				palavras.add(scanner.nextLine().trim());
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} finally {

			if (scanner != null) {
				scanner.close();
			}
		}
	}

	public Palavra proximaPalavra() throws JogoDaForcaException {

		if (palavras.size() == 0) {
			throw new JogoDaForcaException("Nenhuma palavra foi encontrada");
		}

		int pos = RandomUtils.gerarNumeroRandomico(0, palavras.size());

		Palavra palavra = new Palavra(palavras.get(pos));

		return palavra;
	}
}
