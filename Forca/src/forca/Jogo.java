package forca;

import java.util.HashSet;
import java.util.Set;

public class Jogo {
	private final String palavra;
	private Set<Character> reveladas = new HashSet<>();
	
	// 1 cabeça + 1 corpo + 2 braços + 2 pernas = 6
	private static final int MAX_ERROS = 6;
	private int erros = 0;
	
	public Jogo(String palavra) {
		this.palavra = palavra;
	}

	public int getErros() {
		return erros;
	}
	
	public boolean jogar(char letra) {
		boolean letraExiste = palavra.indexOf(letra) >= 0;
		if (letraExiste) reveladas.add(letra);
		else erros++;
		return letraExiste;
	}

	public String estadoAtual() {
		String resultado = "";
		for (String letraAtual : palavra.split(""))
			resultado += (reveladas.contains(letraAtual.charAt(0)) ? letraAtual : "_") + " ";
		return resultado.trim();
	}
	
	public boolean terminou() {
		return ganhou() || perdeu();
	}

	public boolean ganhou() {
		for (String letraAtual : palavra.split(""))
			if (!reveladas.contains(letraAtual.charAt(0))) return false;
		return true;
	}

	public boolean perdeu() {
		return erros >= MAX_ERROS;
	}

}
