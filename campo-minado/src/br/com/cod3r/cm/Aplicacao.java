package br.com.cod3r.cm;

import br.com.cod3r.cm.modelo.Tabuleiro;
import br.com.cod3r.cm.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {
		Tabuleiro tabuleiro = new Tabuleiro(8, 8, 4);
		new TabuleiroConsole(tabuleiro);
		
//		tabuleiro.abrir(3, 3);
//		tabuleiro.alterarMarcacao(4, 4);
//		tabuleiro.alterarMarcacao(4, 5);
//		System.out.println(tabuleiro);

	}

}
