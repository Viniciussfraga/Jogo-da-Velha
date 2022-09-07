package tabuleiro;

public class Tabuleiro {

	private char[][] tabuleiro = new char[3][3];
	private int row, column;
	private boolean testando = true;

	public Tabuleiro() {
	}

	public boolean getTestando() {
		return testando;
	}

	public char[][] mTabuleiro(String posicao, int jogador) {
		String[] values = posicao.split("");
		row = Integer.parseInt(values[0]);
		column = Integer.parseInt(values[1]);
		testarPosicao(jogador);
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
				if (tabuleiro[i][j] == '-') {
					System.out.print(String.valueOf(i) + String.valueOf(j));
				} else {
					System.out.print(tabuleiro[i][j] + " ");
				}
				if (j <= 1) {
					System.out.print(" | ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public void testarPosicao(int jogador) {
		if (tabuleiro[row][column] == 'X' || tabuleiro[row][column] == 'O') {
			System.out.println("Posição inválida");
		} else {
			tabuleiro[row][column] = (jogador == 1) ? 'X' : 'O';
		}
	}
}
