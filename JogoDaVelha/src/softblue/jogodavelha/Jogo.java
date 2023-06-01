package softblue.jogodavelha;

import java.util.ArrayList;
import java.util.List;

import softblue.jogodavelha.io.Console;
import softblue.jogodavelha.pontuacao.GerenciadorPontuacao;
import softblue.jogodavelha.pontuacao.GerenciadorPontuacaoArquivo;

public class Jogo {

	private Tabuleiro tabuleiro = new Tabuleiro();

	private List<Jogador> jogadores = new ArrayList<Jogador>();

	private GerenciadorPontuacao gerenciadorPontuacao;

	public void jogar() throws JogoDaVelhaException {
		System.out.println("=================");
		System.out.println("| JOGO DA VELHA |");
		System.out.println("=================");
		System.out.println();

		gerenciadorPontuacao = new GerenciadorPontuacaoArquivo();

		System.out.print("Nome do Jogador 1: ");
		String nome = Console.readString();
		jogadores.add(new Jogador(nome, 'X'));

		Integer pontuacao = gerenciadorPontuacao.getPontuacao(nome);
		String msg = "O jogador %s já possui %d %s!\n";
		if (pontuacao != null) {
			System.out.format(msg, nome, pontuacao, pontuacao == 1 ? "vitória" : "vitórias");
		}

		System.out.print("Nome do Jogador 2: ");
		nome = Console.readString();
		jogadores.add(new Jogador(nome, 'O'));

		pontuacao = gerenciadorPontuacao.getPontuacao(nome);
		if (pontuacao != null) {
			System.out.format(msg, nome, pontuacao, pontuacao == 1 ? "vitória" : "vitórias");
		}

		boolean finalizado = false;

		int indexJogadorAtual = 0;

		Jogador vencedor = null;

		while (!finalizado) {

			tabuleiro.imprimir();

			Jogador jogador = jogadores.get(indexJogadorAtual);
			System.out.print("Jogador '" + jogador.getNome() + "' => ");
			boolean sequenciaEncontrada;
			try {
				Jogada jogada = jogador.obterJogada();

				sequenciaEncontrada = tabuleiro.efetuarJogada(jogada, jogador.getSimbolo());
			} catch (JogadaInvalidaException e) {

				System.out.println("Erro: " + e.getMessage());
				continue;
			}
			if (sequenciaEncontrada) {
				vencedor = jogador;
				finalizado = true;
				
			} else if (tabuleiro.isCompleto()) {
				finalizado = true;
				
			}

			indexJogadorAtual = (indexJogadorAtual + 1) % jogadores.size();
		}

		System.out.println();

		if (vencedor == null) {
			System.out.println("O jogo terminou empatado!");
		} else {
			System.out.println("O jogador '" + vencedor.getNome() + "' venceu o jogo!");

			gerenciadorPontuacao.gravarPontuacao(vencedor.getNome());
		}

		tabuleiro.imprimir();
	}
}