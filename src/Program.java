import java.util.Scanner;

import tabuleiro.Tabuleiro;

public class Program {

	public static void main(String[] args) {

		System.out.println("Para iniciar o jogo tecle 'p' e para sair do jogo, tecle 'e'. ");
		Scanner input = new Scanner(System.in);
		char tecla = input.next().toLowerCase().charAt(0);
		Tabuleiro tabuleiro = new Tabuleiro();
		tabuleiro.iniciarTab();
		String posicao;
		int turno = 0;
		int jogador = 0;

		if (tecla == 'p') {
			System.out.println("Jogador um é representando por 'x' e jogador dois é representado por 'o'. ");
		} else if (tecla == 'e') {
			System.exit(tecla);
		}
		tabuleiro.imprimeTab();
		for (int i = 1; i <= 5; i++) {
			for (int j = 1;  j%2!=0 ; j--) {
				System.out.println();
				System.out.println("Vez do jogador 1 (x): ");
				posicao = input.next();
				jogador = 1;
				tabuleiro.mTabuleiro(posicao, jogador);
				turno++;
				System.out.println("Turno: " + turno);
				tabuleiro.imprimeTab();
				
			for (j = 2;  j%2==0;  j++) {
				System.out.println();
				System.out.println("Vez do jogador 2 (o): ");
				posicao = input.next();
				jogador = 2;
				tabuleiro.mTabuleiro(posicao, jogador);
				turno++;
				System.out.println("Turno: " + turno);
				tabuleiro.imprimeTab();
				}
			}
		}
		tabuleiro.imprimeTab();
		input.close();
	}
}
