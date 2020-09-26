package br.com.cod3r.cm.modelo;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.cod3r.cm.excecao.ExplosaoException;

public class CampoTeste {
	
	private Campo campo;
	
	@BeforeEach
	void iniciarCampo () { 
		campo = new Campo (3,3 );
	}
	
	@Test
	void testeVisinhoRealDist1Esq () {
		Campo vizinho = new Campo (3,2) ;
		boolean resultado = campo.adicionarVizinho(vizinho);		
		assertTrue(resultado);		
	}
	
	@Test
	void testeVisinhoRealDist1Dir () {
		Campo vizinho = new Campo (3,4) ;
		boolean resultado = campo.adicionarVizinho(vizinho);		
		assertTrue(resultado);		
	}
	
	
	@Test
	void testeVisinhoRealDist1Cima () {
		Campo vizinho = new Campo (2,3)  ;
		boolean resultado = campo.adicionarVizinho(vizinho);		
		assertTrue(resultado);		
	}
	
	@Test
	void testeVisinhoRealDist1baixo () {
		Campo vizinho = new Campo (4,3)  ;
		boolean resultado = campo.adicionarVizinho(vizinho);		
		assertTrue(resultado);		
	}

	@Test
	void testeVisinhoRealDist2 () {
		Campo vizinho = new Campo (2,2)  ;
		boolean resultado = campo.adicionarVizinho(vizinho);		
		assertTrue(resultado);		
	}
	
	
	@Test
	void testeNaoVizinho () {
		Campo vizinho = new Campo (9,8)  ;
		boolean resultado = campo.adicionarVizinho(vizinho);		
		assertFalse(resultado);		
	}
	
	@Test 
	void testValorPadraoAtribuitoMarcado () {
		assertFalse(campo.isMArcado());
		
	}
	
	@Test 
	void testAlternMarcacao() {
		campo.alternarMarcacao();
		assertTrue(campo.isMArcado());
		
	}
	
	@Test 
	void testAlternMarcacao2x() {
		campo.alternarMarcacao();
		campo.alternarMarcacao();
		assertFalse(campo.isMArcado());		
	}
	
	@Test 
	void testeAbrirNaoMinadoNaoMarcado() { 
		assertTrue(campo.abrir()) ;
	}
	
	@Test 
	void testeAbrirNaoMinadoMarcado() {
		campo.alternarMarcacao();
		assertFalse(campo.abrir()) ;
	}
	
	@Test 
	void testeAbrirMinadoMarcado() {
		campo.minar();
		campo.alternarMarcacao();
		assertFalse(campo.abrir()) ;
	}
	
	@Test 
	void testeAbrirMinadoNaoMarcado() {
		campo.minar();
		assertThrows(ExplosaoException.class, () -> {campo.abrir(); } );		
	}
	
	@Test
	void testeAbrirCOmVizinhos1() { 
		Campo campo22 = new Campo (2,2) ;
		Campo campo11 = new Campo (1,1) ;
		campo22.adicionarVizinho(campo11);			
		campo.adicionarVizinho(campo22);
		campo.abrir();
		assertTrue(campo22.isAberto() && campo11.isAberto() ) ;				
	}
	
	@Test
	void testeAbrirCOmVizinhos2() {
		Campo campo11 = new Campo (1,1) ;
		Campo campo12 = new Campo (1,2) ;
		Campo campo22 = new Campo (2,2) ;
		campo12.minar();
		campo22.adicionarVizinho(campo11);
		campo22.adicionarVizinho(campo12);
		campo.adicionarVizinho(campo22);
		campo.abrir();
		assertTrue(campo22.isAberto() && campo11.isFechado() ) ;				
	}
}

