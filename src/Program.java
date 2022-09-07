import java.util.Scanner;

import tabuleiro.Tabuleiro;

public class Program {

	public static void main(String[] args) {
		System.out.println("Para iniciar o jogo tecle 'p' e para sair do jogo, tecle 'e'. ");
		Scanner input = new Scanner(System.in);
		char tecla = input.next().toUpperCase().charAt(0);
		Tabuleiro tabuleiro = new Tabuleiro();
		tabuleiro.iniciarTab();
		String posicao;
		int turno = 0;
		int jogador = 0;
		boolean jogoAcabou = false;

		if (tecla == 'p') {
			System.out.println("Jogador um é representando por 'X' e jogador dois é representado por 'O'. ");
		} else if (tecla == 'e') {
			System.exit(tecla);
		}
		tabuleiro.imprimeTab();
		do {
			jogador = (jogador == 1) ? 2 : 1;
			System.out.println("Vez do jogador " + jogador);
			posicao = input.next();
			tabuleiro.mTabuleiro(posicao, jogador);
			turno++;
			tabuleiro.imprimeTab();
			System.out.println("Turno: " + turno);
		} while (!jogoAcabou);
		input.close();
	}
}
