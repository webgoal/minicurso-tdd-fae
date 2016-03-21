package forca;

import org.junit.Test;

import static org.junit.Assert.*;

public class JogoTest {

	@Test public void deveConterUmaLetra() {
		Jogo jogo = new Jogo();
		char letra = 'a';
		
		assertTrue(jogo.contem(letra));
	}
	
	@Test public void naoPodeConterUmaLetra() {
		Jogo jogo = new Jogo();
		char letra = 'x';
		
		assertFalse(jogo.contem(letra));
	}
	
	@Test public void naoDeveTerNenhumaLetraReveladaNoInicioDoJogo() {
		Jogo jogo = new Jogo();
		assertEquals("_ _ _ _ _ _", jogo.estadoAtual());
	}
	
	@Test public void deveRevelarUmaLetraExistente() {
		Jogo jogo = new Jogo();
		jogo.contem('a');
		assertEquals("a _ _ _ _ _", jogo.estadoAtual());
	}
	
	@Test public void deveRevelarUmaOutraLetraExistente() {
		Jogo jogo = new Jogo();
		jogo.contem('e');
		assertEquals("_ _ e _ _ e", jogo.estadoAtual());
	}
	
	@Test public void deveRevelarDuasLetrasDiferentesExistentes() {
		Jogo jogo = new Jogo();
		jogo.contem('a');
		jogo.contem('e');
		assertEquals("a _ e _ _ e", jogo.estadoAtual());
	}

}
