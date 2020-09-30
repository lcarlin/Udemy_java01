package br.com.cod3r.calc.visao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class Botao extends JButton {
	private static final long serialVersionUID = 7180163063760583366L;

	public Botao(String texto , Color cor) {
		setText (texto);				
		setFont( new Font("courier", Font.PLAIN, 25 ));
		setOpaque(true);
		setBackground(cor);
		setForeground(Color.WHITE);
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
	}
}
