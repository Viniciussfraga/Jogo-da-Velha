import java.util.Arrays;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		System.out.println("Para iniciar o jogo tecle 'p' e para sair do jogo, tecle 'e'. ");
		Scanner input = new Scanner(System.in);
		char[][] mat = new char[3][3];
		char tecla = input.next().toLowerCase().charAt(0);
		StringBuilder sb = new StringBuilder( 'g');

		if (tecla == 'p') {
			System.out.println("Jogador um é representando por 'x' e jogador dois é representado por 'o'. ");
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
				int jogador = input.nextInt();

				// posição x
				if (jogador == 1) {
					System.out.println("Faça sua jogada, escolha uma posição (x): ");
					int posicao = input.nextInt();
					if (posicao >= 00 && posicao <= 02 || posicao >= 10 && posicao <= 12 || posicao >= 20 && posicao <= 22) {
						if (posicao == 00) {
							mat[0][0] = 'x';
						} else if (posicao == 01) {
							mat[0][1] = 'x';
						} else if (posicao == 02) {
							mat[0][2] = 'x';
						} else if (posicao == 10) {
							mat[1][0] = 'x';
						} else if (posicao == 11) {
							mat[1][1] = 'x';
						} else if (posicao == 12) {
							mat[1][2] = 'x';
						} else if (posicao == 20) {
							mat[2][0] = 'x';
						} else if (posicao == 21) {
							mat[2][1] = 'x';
						} else if (posicao == 22) {
							mat[2][2] = 'x';
						}
					} else {
						System.out.println("Posição invalida!");
					}

				}
				// posição o
				if (jogador == 2) {
					System.out.println("Faça sua jogada, escolha uma posição (o): ");
					int posicao = input.nextInt();
					if (posicao >= 00 && posicao <= 02 || posicao >= 10 && posicao <= 12 || posicao >= 20 && posicao <= 22) {
						if (posicao == 00) {
							mat[0][0] = 'o';
						} else if (posicao == 01) {
							mat[0][1] = 'o';
						} else if (posicao == 02) {
							mat[0][2] = 'o';
						} else if (posicao == 10) {
							mat[1][0] = 'o';
						} else if (posicao == 11) {
							mat[1][1] = 'o';
						} else if (posicao == 12) {
							mat[1][2] = 'o';
						} else if (posicao == 20) {
							mat[2][0] = 'o';
						} else if (posicao == 21) {
							mat[2][1] = 'o';
						} else if (posicao == 22) {
							mat[2][2] = 'o';
						}
					} else {
						System.out.println("Posição invalida!");
					}
				}
				sb.append(mat);
				System.out.println(mat.toString());
			}
		}
		input.close();
	}
}
