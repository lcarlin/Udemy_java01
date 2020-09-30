package br.com.cod3r.cm.visao;

import java.awt.GridLayout;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import br.com.cod3r.cm.modelo.Tabuleiro;

public class PainelTabuleiro extends JPanel {
	private static final long serialVersionUID = -6808307679993603661L;

	public PainelTabuleiro(Tabuleiro tabuleiro) {
		setLayout(new GridLayout(tabuleiro.getLinhas(), tabuleiro.getColunas()));

//		int total = tabuleiro.getLinhas() * tabuleiro.getColunas() ; 
//		for (int i = 0; i < total ; i++) {
//			add(new BotaoCampo(null));

		tabuleiro.paraCadaCampo(c -> add(new BotaoCampo(c)));

		tabuleiro.registrarObservador(e -> {
			SwingUtilities.invokeLater(() -> {
				if (e.isGanhou()) {
					JOptionPane.showMessageDialog(this, "Para-Bens , vc é   Bixão");
				} else {
					JOptionPane.showMessageDialog(this, "Perderu Prebói!!!");
				}
				tabuleiro.reiniciar();

			});
		});

	}

}
