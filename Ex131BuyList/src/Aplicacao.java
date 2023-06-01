import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplicacao {

	private static final String LIST_FILE = "lista.txt";

	public static void main(String[] args) throws IOException {

		List<String> lista = readFile();

		if(lista != null && lista.size() > 0) {
			System.out.println("Estes são os itens já cadastrados: ");

			for (String item : lista) {
				System.out.println("=> " + item);
			}
		}

		Scanner keyboard = new Scanner(System.in);

		PrintWriter writer = null;
		try {

			writer = new PrintWriter(new FileWriter(LIST_FILE, true));

			while (true) {
				System.out.println("Insira um novo item: ");
				String item = keyboard.nextLine();

				if (item.trim().length() == 0) {
					continue;
				}

				if (item.equals("0")) {
					System.out.println("Fim da execução");
					break;
				}

				writer.println(item);				
			}
		}finally {
			if(writer != null) {
				writer.close();
			}
			keyboard.close();
		}

	}

	private static List<String> readFile() throws IOException {

		File file = new File(LIST_FILE);

		if(!file.exists()) {
			return null;

		}

		List<String> lista = new ArrayList<String>();

		BufferedReader reader = null;

		try {

			reader = new BufferedReader(new FileReader(file));

			String line;

			while ((line = reader.readLine()) != null) {
				lista.add(line.trim());
			}

			return lista;
		} finally {

			if (reader != null) {
				reader.close();
			}
		}
	}
}