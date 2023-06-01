import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Aplicacao {

	private static final String FILE = "livros.bin";

	public static void main(String[] args) throws Exception {
		
		System.out.println("Escolha uma opção:");
		System.out.println("1 - Gravar dados");
		System.out.println("2 - Ler dados");
		System.out.println("=> ");

		Scanner keyboard = new Scanner(System.in);
		String opcao = keyboard.nextLine();
		keyboard.close();

		if (opcao.equals("1")) {
			gravarDados();

		} else if (opcao.equals("2")) {
			lerDados();
		} else {
			System.out.println("Opção desconhecida");
		}
	}

	private static void lerDados() throws Exception {

		Livro l1 = new Livro();
		Livro l2 = new Livro();

		DataInputStream dis = null;
		try {

			dis = new DataInputStream(new FileInputStream(FILE));

			l1.read(dis);

			l2.read(dis);
		} finally {

			if (dis != null) {
				dis.close();
			}
		}

		System.out.println(l1);
		System.out.println(l2);
	}

	private static void gravarDados() throws Exception {

		String d1 = "01/04/1972";
		String d2 = "25/02/1980";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Autor a1 = new Autor();
		a1.setNome("José Silva");
		a1.setDataNascimento(sdf.parse(d1));

		Autor a2 = new Autor();
		a2.setNome("Maria Oliveira");
		a2.setDataNascimento(sdf.parse(d2));

		Livro l1 = new Livro();
		l1.setTitulo("Orientação a Objetos");
		l1.setNumPaginas(350);
		l1.setAutor(a1);

		Livro l2 = new Livro();
		l2.setTitulo("Programação Java");
		l2.setNumPaginas(200);
		l2.setAutor(a2);

		DataOutputStream dos = null;

		try {
			
			dos = new DataOutputStream(new FileOutputStream(FILE));

			l1.write(dos);

			l2.write(dos);
		} finally {

			if (dos != null) {
				dos.close();
			}
		}

	}

}
