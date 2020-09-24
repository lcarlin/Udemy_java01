package fundamentos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Calcular {
	public static void main(String[] args) {
//		String valor1 = JOptionPane.showInputDialog("Digite o 1º Numero ");
//		String valor2 = JOptionPane.showInputDialog("Digite o 2º Numero ");
//		String operacao = JOptionPane.showInputDialog("Digite a Operacao  ");
		
		Scanner entrada  = new Scanner(System.in );
		System.out.print("Digite o 1º termo   :=> ");
		double valor1  = entrada.nextDouble() ; 
		
		System.out.print("Digite o 2º termo   :=> ");
		double valor2  = entrada.nextDouble();
		
		System.out.print("Digite o A poeracao :=> ");
		String Operacao  = entrada.next();
		
//		double dValor1 = Double.parseDouble(valor1);
		//double dVAlor2 = Double.parseDouble(valor2);
			
		double resultado = "+".equals(Operacao) ? valor1 + valor2 : 0  ;
		resultado = "-".equals(Operacao) ? valor1 - valor2 : resultado  ;
		resultado = "*".equals(Operacao) ? valor1 * valor2 : resultado  ;
		resultado = "/".equals(Operacao) ? valor1 / valor2 : resultado  ;
		resultado = "%".equals(Operacao) ? valor1 % valor2 : resultado  ;
		
		System.out.printf("%.2f %s %.2f = %.2f " ,valor1, Operacao,   valor2, resultado  );
		
				
			
		

		entrada.close();
		
	}

}
