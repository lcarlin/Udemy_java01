package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String valor1 = JOptionPane.showInputDialog("Digite o 1º Numero ");
		String valor2 = JOptionPane.showInputDialog("Digite o 2º Numero ");
		System.out.println("Valor 01 :=> " + valor1);
		System.out.println("Valor 02 :=> " + valor2 );
		System.out.println(valor1 + valor2);
		
		double numero1 = Double.parseDouble(valor1) ;
		double numero2 = Double.parseDouble(valor2) ;
		
		double soma = numero1 + numero2 ; 
		System.out.println("Sima é " +soma );
		System.out.println("E a média é " + (soma / 2 ));

	}

}
