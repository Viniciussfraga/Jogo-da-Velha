import java.util.Scanner;

import tabuleiro.Tabuleiro;

public class Program {

	public static void main(String[] args) {

		System.out.println("Para iniciar o jogo tecle 'p' e para sair do jogo, tecle 'e'. ");
		Scanner input = new Scanner(System.in);
		char tecla = input.next().toLowerCase().charAt(0);
		Tabuleiro tabuleiro = new Tabuleiro();
		tabuleiro.iniciarTab();
		int jogador = 0;

		if (tecla == 'p') {
			System.out.println("Jogador um � representando por 'x' e jogador dois � representado por 'o'. ");
			System.out.println();
			System.out.println("  Tabuleiro jogo da velha: ");
			System.out.println();
			System.out.println("	00 | 01 | 02 ");
			System.out.println("	10 | 11 | 12 ");
			System.out.println("	20 | 21 | 22 ");
		} else if (tecla == 'e') {
			System.exit(tecla);
		}

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.println("Quem joga agora? jogador 1 ou 2? ");
				jogador = input.nextInt();

				if (jogador == 1) {
					System.out.println("Fa�a sua jogada jogador 1! Escolha uma posi��o (x): ");
					int posicao = input.nextInt();
					tabuleiro.mTabuleiro(posicao, jogador);
				}
				if (jogador == 2) {
					System.out.println("Fa�a sua jogada jogador 2! Escolha uma posi��o (o): ");
					int posicao = input.nextInt();
					tabuleiro.mTabuleiro(posicao, jogador);
				}
				tabuleiro.imprimeTab();
			}
		}
		input.close();
	}
}
