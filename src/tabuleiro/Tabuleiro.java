package tabuleiro;

public class Tabuleiro {

	private char[][] tabuleiro = new char[3][3];

	public Tabuleiro() {
	}

	public char[][] mTabuleiro(int posicao, int jogador) {

		// posição x
		if (jogador == 1) {
			if (posicao >= 00 && posicao <= 02 || posicao >= 10 && posicao <= 12 || posicao >= 20 && posicao <= 22) {
				if (posicao == 00) {
					tabuleiro[0][0] = 'x';
				} else if (posicao == 01) {
					tabuleiro[0][1] = 'x';
				} else if (posicao == 02) {
					tabuleiro[0][2] = 'x';
				} else if (posicao == 10) {
					tabuleiro[1][0] = 'x';
				} else if (posicao == 11) {
					tabuleiro[1][1] = 'x';
				} else if (posicao == 12) {
					tabuleiro[1][2] = 'x';
				} else if (posicao == 20) {
					tabuleiro[2][0] = 'x';
				} else if (posicao == 21) {
					tabuleiro[2][1] = 'x';
				} else if (posicao == 22) {
					tabuleiro[2][2] = 'x';
				}
			}
		} // posição o
		else if (jogador == 2) {
			if (posicao >= 00 && posicao <= 02 || posicao >= 10 && posicao <= 12 || posicao >= 20 && posicao <= 22) {
				if (posicao == 00) {
					tabuleiro[0][0] = 'o';
				} else if (posicao == 01) {
					tabuleiro[0][1] = 'o';
				} else if (posicao == 02) {
					tabuleiro[0][2] = 'o';
				} else if (posicao == 10) {
					tabuleiro[1][0] = 'o';
				} else if (posicao == 11) {
					tabuleiro[1][1] = 'o';
				} else if (posicao == 12) {
					tabuleiro[1][2] = 'o';
				} else if (posicao == 20) {
					tabuleiro[2][0] = 'o';
				} else if (posicao == 21) {
					tabuleiro[2][1] = 'o';
				} else if (posicao == 22) {
					tabuleiro[2][2] = 'o';
				}
			}
		} else {
			System.out.println("Jogador inválido");
		}
		return tabuleiro;
	}

	public void iniciarTab() {
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[i].length; j++) {
				tabuleiro[i][j] = '-';
			}
		}
	}

	public void imprimeTab() {
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[i].length; j++) {
				if (j <= 1) {
					System.out.print(tabuleiro[i][j] + " | ");
				} else {
					System.out.print(tabuleiro[i][j]);
				}
			}
			System.out.println();
		}
	}

}
