package softblue.agenda;

import java.io.IOException;
import java.util.List;

public class Aplicacao {

	private Menu menu;

	private Agenda agenda;

	public void iniciar() throws IOException {
		menu = new Menu();
		agenda = new Agenda();

		int opcao = 0;

		while (opcao != Menu.OPCAO_SAIR) {
			try {
				opcao = menu.exibirOpcoes();

				switch (opcao) {
				case Menu.OPCAO_INSERIR:
					inserir();
					break;
				case Menu.OPCAO_ALTERAR:
					alterar();
					break;
				case Menu.OPCAO_EXCLUIR:
					excluir();
					break;
				case Menu.OPCAO_LISTAR_LETRA:
					listarPorLetra();
					break;
				case Menu.OPCAO_PROCURAR:
					procurar();
					break;
				}

			} catch (AgendaException e) {

				System.out.println("Erro: " + e.getMessage());
				System.out.println();
			}
		}

		System.out.println("Fim da aplicação!");
	}

	private void inserir() throws AgendaException, IOException {

		System.out.println("Nome: ");
		String nome = Console.readString();
		System.out.println("Telefone: ");
		String telefone = Console.readString();

		Contato contato = new Contato(nome, telefone);
		agenda.inserir(contato);

		System.out.println("Contato inserido!");		
		System.out.println();
	}

	private void alterar() throws AgendaException, IOException {
		System.out.print("Nome: ");
		String nome = Console.readString();
		
		Contato contato = agenda.obterContato(nome);
		
		if (contato == null) {
			throw new AgendaException("O contato " + nome + " não existe");
		}
		
		System.out.print("Telefone: ");
		String telefone = Console.readString();
		
		contato.setTelefone(telefone);
		agenda.alterar(contato);
		
		System.out.println("Contato alterado!");
		System.out.println();
	}

	private void excluir() throws AgendaException, IOException {
		
		System.out.print("Nome: ");
		String nome = Console.readString();
		
		agenda.excluir(nome);
		
		System.out.println("Contato excluído!");
		System.out.println();
	}

	private void listarPorLetra() throws AgendaException {
		
		System.out.print("Letra: ");
		char letra = Console.readChar();
		
		List<Contato> contatos = agenda.listarContatosPorLetra(letra);
		
		System.out.println("Contatos com a letra '" + Character.toUpperCase(letra) + "':");
		
		if (contatos.isEmpty()) {
			System.out.println("Nenhum contato encontrado!");
		} else {
			for (Contato contato : contatos) {
				System.out.println(contato);
			}
		}
		System.out.println();
	}

	private void procurar() throws AgendaException {
		
		System.out.print("Parte do nome: ");
		String parteNome = Console.readString();
		
		List<Contato> contatos = agenda.listarContatosPorParteNome(parteNome);
		
		System.out.println("Contatos encontrados com a parte do nome '" + parteNome + "':");
		
		if (contatos.isEmpty()) {
			System.out.println("Nenhum contato encontrado!");
		} else {
			for (Contato contato : contatos) {
				System.out.println(contato);
			}
		}
		System.out.println();
	}
}
