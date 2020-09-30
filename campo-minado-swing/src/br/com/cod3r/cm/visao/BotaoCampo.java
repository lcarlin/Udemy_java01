package br.com.cod3r.cm.visao;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.SwingUtilities;

import br.com.cod3r.cm.modelo.Campo;
import br.com.cod3r.cm.modelo.CampoEvento;
import br.com.cod3r.cm.modelo.CampoObservador;
public class BotaoCampo extends JButton 
			implements CampoObservador, MouseListener{
	private static final long serialVersionUID = 7496663370636389450L;
	
	private final Color BG_PADRAO   = new Color(184,184,184);
	private final Color BG_MARCADO  = new Color(8,179,247);
	private final Color BG_EXPLODIR = new Color(189,66,68);
	private final Color TEXTO_VERDE = new Color(0,100,0);
	
	private Campo campo ;
	public BotaoCampo(Campo campo )   {
		this.campo = campo;
		setBorder(BorderFactory.createBevelBorder(0));
		
		setBackground(BG_PADRAO);
		addMouseListener(this);
		campo.registrarObservador(this);
	}
	
	@Override
	public void eventoOcorreu(Campo C, CampoEvento evento) {
		switch(evento) {
		case ABRIR:
			aplicarEstiloAbrir();
			break ;
		case MARCAR:
			aplicarEstiloMarcar();
			break ;
		case EXPLODIR:
			aplicarEstiloExplodir();
			break ;
		default :
			aplicarEstiloPadrao();
			break ;
		}
		SwingUtilities.invokeLater(() -> {
			repaint() ;
			validate() ;
			
		});
	}


	private void aplicarEstiloPadrao() {
		setBackground(BG_PADRAO);
		setBorder(BorderFactory.createBevelBorder(0));
		setText("");
	}

	private void aplicarEstiloExplodir() {
		setBackground(BG_EXPLODIR);
		setForeground(Color.WHITE);
		setText("X");
	}

	private void aplicarEstiloMarcar() {
		setBackground(BG_MARCADO);
		setForeground(Color.BLACK);
		setText("M");
		
		
	}

	private void aplicarEstiloAbrir() {
		setBorder(BorderFactory.createLineBorder(Color.GRAY));
		if (campo.isMinado()){
			setBackground(BG_EXPLODIR);
			return;
			
		}
		
		setBackground(BG_PADRAO);
		switch(campo.minasNaVizinhanca()) {
		case 1:
			setForeground(TEXTO_VERDE);
			break ;
		case 2:
			setForeground(Color.BLUE);
			break ;
		case 3:
			setForeground(Color.YELLOW);
			break ;
		case 4:
		case 5:
		case 6:
			setForeground(Color.RED);
			break ;							
		default:
			setForeground(Color.PINK);
			break ;								
		}
		String valor = !campo.vizinhancaSegura() 
				? campo.minasNaVizinhanca()  +"":"" ;
		setText(valor);
	}
	
	
	// interface dos eventos do mouse

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if (e.getButton() == 1 ) {
			System.out.println("Bot�o esquerdo ");
			campo.abrir();
		} else {
			System.out.println("But�o dereito");
			campo.alternarMarcacao();
		}

		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}