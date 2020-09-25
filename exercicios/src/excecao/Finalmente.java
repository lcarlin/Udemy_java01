package excecao;

import java.util.Scanner;

public class Finalmente {
	public static void main(String[] args) {
		Scanner entrada  = new Scanner(System.in);
		try {
			System.out.print("Entra com um numero pra dividi-lo por 7 :");
			System.out.println(7 / entrada.nextInt());
			
		} catch ( Exception e) {
			System.out.println(e.getMessage());
			
		} finally {
			System.out.println("Finalmente ... .. . ");
			entrada.close();
		}
		
		System.out.println("Esse é o fim ");
		

	}
}
