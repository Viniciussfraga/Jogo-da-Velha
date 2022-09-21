package tabuleiro;

public class Tabuleiro {

	private char[][] tabuleiro = new char[3][3];
	private int row, column;
	boolean venceuX = false;
	boolean venceuO = false;
	boolean jogoAcabou = false;
	public boolean auxPosicao = false;

	public Tabuleiro() {
	}

	public boolean getjogoAcabou() {
		return jogoAcabou;
	}

	public char[][] mTabuleiro(String posicao, int jogador) {
		String[] values = posicao.split("");
		row = Integer.parseInt(values[0]);
		column = Integer.parseInt(values[1]);
		testarPosicao(jogador);
		vitoria();
		testaempate();
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
			System.out.println("Posição ocupada");
			auxPosicao = true;
		} else {
			tabuleiro[row][column] = (jogador == 1) ? 'X' : 'O';
			auxPosicao = false;
		}
	}

	public void vitoria() {
	
		// diagonal esquerda cima
		venceuX = tabuleiro[0][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][2] == 'X' ? true : false;
		venceuO = tabuleiro[0][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][2] == 'O' ? true : false;
		if (venceuX) {
			System.out.println("Parabéns, jogador 1 venceu!");
			jogoAcabou = true;
		} else if (venceuO) {
			System.out.println("Parabéns, jogador 2 venceu!");
			jogoAcabou = true;
		}
		// diagonal esquerda baixo
		venceuX = tabuleiro[2][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[0][2] == 'X' ? true : false;
		venceuO = tabuleiro[2][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[0][2] == 'O' ? true : false;
		if (venceuX) {
			System.out.println("Parabéns, jogador 1 venceu!");
			jogoAcabou = true;
		} else if (venceuO) {
			System.out.println("Parabéns, jogador 2 venceu!");
			jogoAcabou = true;
		}
		// horizontal topo
		venceuX = tabuleiro[0][0] == 'X' && tabuleiro[0][1] == 'X' && tabuleiro[0][2] == 'X' ? true : false;
		venceuO = tabuleiro[0][0] == 'O' && tabuleiro[0][1] == 'O' && tabuleiro[0][2] == 'O' ? true : false;
		if (venceuX) {
			System.out.println("Parabéns, jogador 1 venceu!");
			jogoAcabou = true;
		} else if (venceuO) {
			System.out.println("Parabéns, jogador 2 venceu!");
			jogoAcabou = true;
		}
		// horizontal meio
		venceuX = tabuleiro[1][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[1][2] == 'X' ? true : false;
		venceuO = tabuleiro[1][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[1][2] == 'O' ? true : false;
		if (venceuX) {
			System.out.println("Parabéns, jogador 1 venceu!");
			jogoAcabou = true;
		} else if (venceuO) {
			System.out.println("Parabéns, jogador 2 venceu!");
			jogoAcabou = true;
		}
		// horizontal baixo
		venceuX = tabuleiro[2][0] == 'X' && tabuleiro[2][1] == 'X' && tabuleiro[2][2] == 'X' ? true : false;
		venceuO = tabuleiro[2][0] == 'O' && tabuleiro[2][1] == 'O' && tabuleiro[2][2] == 'O' ? true : false;
		if (venceuX) {
			System.out.println("Parabéns, jogador 1 venceu!");
			jogoAcabou = true;
		} else if (venceuO) {
			System.out.println("Parabéns, jogador 2 venceu!");
			jogoAcabou = true;
		}
		// Vertical esquerda
		venceuX = tabuleiro[0][0] == 'X' && tabuleiro[1][0] == 'X' && tabuleiro[2][0] == 'X' ? true : false;
		venceuO = tabuleiro[0][0] == 'O' && tabuleiro[1][0] == 'O' && tabuleiro[2][0] == 'O' ? true : false;
		if (venceuX) {
			System.out.println("Parabéns, jogador 1 venceu!");
			jogoAcabou = true;
		} else if (venceuO) {
			System.out.println("Parabéns, jogador 2 venceu!");
			jogoAcabou = true;
		}
		// Vertical meio
		venceuX = tabuleiro[0][1] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][1] == 'X' ? true : false;
		venceuO = tabuleiro[0][1] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][1] == 'O' ? true : false;
		if (venceuX) {
			System.out.println("Parabéns, jogador 1 venceu!");
			jogoAcabou = true;
		} else if (venceuO) {
			System.out.println("Parabéns, jogador 2 venceu!");
			jogoAcabou = true;
		}
		// Vertical direita
		venceuX = tabuleiro[0][2] == 'X' && tabuleiro[1][2] == 'X' && tabuleiro[2][2] == 'X' ? true : false;
		venceuO = tabuleiro[0][2] == 'O' && tabuleiro[1][2] == 'O' && tabuleiro[2][2] == 'O' ? true : false;
		if (venceuX) {
			System.out.println("Parabéns, jogador 1 venceu!");
			jogoAcabou = true;
		} else if (venceuO) {
			System.out.println("Parabéns, jogador 2 venceu!");
			jogoAcabou = true;
		}
	}
		

	private void testaempate() {
		int count = 1;
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[i].length; j++) {
				if (tabuleiro[i][j] == 'X' || tabuleiro[i][j] == 'O') {
					count++;
				}
				if (count == 10) {
					jogoAcabou = true;
					System.out.println("Jogo empatado!");
				}
			}

		}
	}
}