package entities;

public class impTela {
	
	Tabuleiro imprimeTabuleiro = new Tabuleiro();

	public static void imprimeTab(Tabuleiro imprimeTabuleiro) {
		for (int i = 0; i < imprimeTabuleiro.tabuleiro.length; i++) {
			for (int j = 0; j < imprimeTabuleiro.tabuleiro[i].length; j++) {
				if (imprimeTabuleiro.tabuleiro[i][j] == '-') {
					System.out.print(String.valueOf(i) + String.valueOf(j));
				} else {
					System.out.print(imprimeTabuleiro.tabuleiro[i][j] + " ");
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
	
}
