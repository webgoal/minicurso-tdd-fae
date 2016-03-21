package forca;

import java.util.Scanner;

public class Main {
	
	private Scanner scanner = new Scanner(System.in);
	private Jogo jogo = new Jogo("atelie");
	private String[] representacaoErros = new String[] {
		"",
		"o",
		"o\n|",
		" o\n/|",
		" o\n/|\\",
		" o\n/|\\\n/",
		" x\n/|\\\n/ \\"
	};
	
	public Main() {
		do {
			System.out.println("Informe uma letra:");
			String letraDigitada = scanner.next().trim();
			if (letraDigitada.length() == 1)
				jogo.jogar(letraDigitada.charAt(0));
			
			System.out.println("______________");
			System.out.println(representacaoErros[jogo.getErros()]);
			System.out.println("______________");
			System.out.println(jogo.estadoAtual());
		} while(!jogo.terminou());
		
		System.out.println(jogo.ganhou() ? "Parabéns, você ganhou!" : "Tente novamente!");
	}

	public static void main(String[] args) {
		new Main();
	}

}
