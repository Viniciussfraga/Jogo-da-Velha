package entities;

public class JogoDaVelha {
	
	static boolean jogoAcabou;
	
	public static boolean getJogoAcabou() {
		return jogoAcabou;
	}

	static public boolean vitoria(char[][] tabuleiro) {
		boolean venceuX = false;
		boolean venceuO = false;
		 jogoAcabou = false;

		// diagonal esquerda cima
		venceuX = tabuleiro[0][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][2] == 'X' ? true : false;
		venceuO = tabuleiro[0][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][2] == 'O' ? true : false;
		testXandO(venceuX, venceuO);

		// diagonal esquerda baixo
		venceuX = tabuleiro[2][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[0][2] == 'X' ? true : false;
		venceuO = tabuleiro[2][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[0][2] == 'O' ? true : false;
		testXandO(venceuX, venceuO);

		// horizontal topo
		venceuX = tabuleiro[0][0] == 'X' && tabuleiro[0][1] == 'X' && tabuleiro[0][2] == 'X' ? true : false;
		venceuO = tabuleiro[0][0] == 'O' && tabuleiro[0][1] == 'O' && tabuleiro[0][2] == 'O' ? true : false;
		testXandO(venceuX, venceuO);

		// horizontal meio
		venceuX = tabuleiro[1][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[1][2] == 'X' ? true : false;
		venceuO = tabuleiro[1][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[1][2] == 'O' ? true : false;
		testXandO(venceuX, venceuO);

		// horizontal baixo
		venceuX = tabuleiro[2][0] == 'X' && tabuleiro[2][1] == 'X' && tabuleiro[2][2] == 'X' ? true : false;
		venceuO = tabuleiro[2][0] == 'O' && tabuleiro[2][1] == 'O' && tabuleiro[2][2] == 'O' ? true : false;
		testXandO(venceuX, venceuO);

		// Vertical esquerda
		venceuX = tabuleiro[0][0] == 'X' && tabuleiro[1][0] == 'X' && tabuleiro[2][0] == 'X' ? true : false;
		venceuO = tabuleiro[0][0] == 'O' && tabuleiro[1][0] == 'O' && tabuleiro[2][0] == 'O' ? true : false;
		testXandO(venceuX, venceuO);

		// Vertical meio
		venceuX = tabuleiro[0][1] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][1] == 'X' ? true : false;
		venceuO = tabuleiro[0][1] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][1] == 'O' ? true : false;
		testXandO(venceuX, venceuO);

		// Vertical direita
		venceuX = tabuleiro[0][2] == 'X' && tabuleiro[1][2] == 'X' && tabuleiro[2][2] == 'X' ? true : false;
		venceuO = tabuleiro[0][2] == 'O' && tabuleiro[1][2] == 'O' && tabuleiro[2][2] == 'O' ? true : false;
		testXandO(venceuX, venceuO);

		// retorna o resultado da validação para o loop
		return jogoAcabou;
	}

	static private void testXandO(boolean x, boolean o) {
		// se o jogo acabou não altera o valor de boolean jogoAcabou
		if (x) {
			System.out.println("Parabéns, jogador 1 venceu!");
			jogoAcabou = true;
		} else if (o) {
			System.out.println("Parabéns, jogador 2 venceu!");
			jogoAcabou = true;
		}
	}

	static public void testaempate(int turno) {
		if (turno == 9) {
			jogoAcabou = true;
			System.out.println("Jogo empatado!");
		}

	}
}