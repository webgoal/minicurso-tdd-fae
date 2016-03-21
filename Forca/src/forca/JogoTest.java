package forca;

import org.junit.Test;

import static org.junit.Assert.*;

public class JogoTest {
	
	private Jogo jogo = new Jogo("atelie");

	@Test public void deveConterUmaLetra() {
		char letra = 'a';
		assertTrue(jogo.jogar(letra));
	}
	
	@Test public void naoPodeConterUmaLetra() {
		char letra = 'x';		
		assertFalse(jogo.jogar(letra));
	}
	
	@Test public void naoDeveTerNenhumaLetraReveladaNoInicioDoJogo() {
		assertEquals("_ _ _ _ _ _", jogo.estadoAtual());
	}
	
	@Test public void deveRevelarUmaLetraExistente() {
		jogo.jogar('a');
		assertEquals("a _ _ _ _ _", jogo.estadoAtual());
	}
	
	@Test public void deveRevelarUmaOutraLetraExistente() {
		jogo.jogar('e');
		assertEquals("_ _ e _ _ e", jogo.estadoAtual());
	}
	
	@Test public void deveRevelarDuasLetrasDiferentesExistentes() {
		jogo.jogar('a');
		jogo.jogar('e');
		assertEquals("a _ e _ _ e", jogo.estadoAtual());
	}
	
	@Test public void deveValidarSeJogadorAindaNaoGanhou() {
		assertFalse(jogo.ganhou());
	}
	
	@Test public void deveValidarSeJogadorGanhou() {
		jogo.jogar('a');
		jogo.jogar('t');
		jogo.jogar('e');
		jogo.jogar('l');
		jogo.jogar('i');
		assertTrue(jogo.ganhou());
	}

	@Test public void deveValidarSeJogadorAindaNaoPerdeu() {
		assertFalse(jogo.perdeu());
	}
	
	@Test public void deveValidarSeJogadorPerdeu() {
		jogo.jogar('x');
		jogo.jogar('y');
		jogo.jogar('z');
		jogo.jogar('n');
		jogo.jogar('o');
		jogo.jogar('p');
		assertTrue(jogo.perdeu());
	}
	
}
