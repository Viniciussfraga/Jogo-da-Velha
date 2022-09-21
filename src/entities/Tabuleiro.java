package entities;

public class Tabuleiro {

	protected char[][] tabuleiro = new char[3][3];
	private int row, column;
	public boolean auxPosicao = false;
	JogoDaVelha jogodaVelha;

	public Tabuleiro() {
	}

	public int getRow() {
		return row;
	}

	public int getColumn() {
		return column;
	}

	public char[][] mTabuleiro(String posicao, int jogador, int turno) {
		String[] values = posicao.split("");
		row = Integer.parseInt(values[0]);
		column = Integer.parseInt(values[1]);
		testarPosicao(jogador);
		JogoDaVelha.vitoria(tabuleiro);
		JogoDaVelha.testaempate(turno);
		return tabuleiro;
	}

	public void iniciarTab() {
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[i].length; j++) {
				tabuleiro[i][j] = '-';
			}
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
}