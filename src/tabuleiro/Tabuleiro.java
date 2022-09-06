package tabuleiro;

public class Tabuleiro {

	private char[][] tabuleiro = new char[3][3];

	public Tabuleiro() {
	}

	public char[][] mTabuleiro(String posicao, int jogador) {
		String[] values = posicao.split("");
		  int row = Integer.parseInt(values[0]);
		  int column = Integer.parseInt(values[1]);
		  tabuleiro[row][column] = (jogador == 1) ? 'X' : 'O';
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
				if(tabuleiro[i][j] == '-') {
				System.out.print(String.valueOf(i) + String.valueOf(j));
				}else {
					System.out.print(tabuleiro[i][j] + " ");
				}
				if (j <= 1) {
					System.out.print( " | ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
