package fundamentos;

import java.util.Scanner;

public class Conversao {

	public static void main(String[] args) {
	
		System.out.println(" Entrar com os 3 salarios dos pe�os: ");
		
		Scanner entrada  = new Scanner(System.in );
		
		System.out.print("Digite o Salario 1�  :=> ");
		String sal1  = entrada.nextLine().replace(",", ".");
		
		System.out.print("Digite o Salario 2�  :=> ");
		String sal2  = entrada.nextLine().replace(",", ".");
		
		System.out.print("Digite o Salario 3�  :=> ");
		String sal3  = entrada.nextLine().replace(",", ".");
		
		System.out.println("=======");
		double salario1 = Double.parseDouble(sal1);
		double salario2 = Double.parseDouble(sal2);
		double salario3 = Double.parseDouble(sal3);
		
		double soma = salario1  + salario2 + salario3 ;
		double media = soma / 3 ;
		
		System.out.println("SOmatoria => " + soma );
		System.out.println("Media     => " + media );
		
		
	
		
		entrada.close();
						

	}

}
