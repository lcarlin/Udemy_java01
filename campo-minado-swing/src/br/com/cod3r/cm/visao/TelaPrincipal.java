package br.com.cod3r.cm.visao;

import javax.swing.JFrame;

import br.com.cod3r.cm.modelo.Tabuleiro;

public class TelaPrincipal extends JFrame{
	private static final long serialVersionUID = 2645558856389966163L;
	public static void main(String[] args) {
		new TelaPrincipal();
	}
	
	public TelaPrincipal() {
		Tabuleiro tabuleiro = new Tabuleiro(16,30, 50);
		
		add(new PainelTabuleiro(tabuleiro)) ;
		
		setTitle("Dançando em Campo Minado");
		setSize(690,438);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		setVisible(true);
	}

}
