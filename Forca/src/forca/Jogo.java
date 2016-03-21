package forca;

import java.util.HashSet;
import java.util.Set;

public class Jogo {
	public static final String palavra = "atelie";
	Set<Character> reveladas = new HashSet<>();
	
	public boolean contem(char letra) {
		boolean letraExiste = palavra.indexOf(letra) >= 0;
		if (letraExiste) reveladas.add(letra);
		return letraExiste;
	}

	public String estadoAtual() {
		String resultado = "";
		for (String letraAtual : palavra.split(""))
			resultado += (reveladas.contains(letraAtual.charAt(0)) ? letraAtual : "_") + " ";
		return resultado.trim();
	}
}
