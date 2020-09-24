package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("BOM ");
		System.out.print(" dia ");
		
		System.out.println(" galera ");
		
		Scanner entrada  = new Scanner(System.in );
		
		System.out.print("Digite Vossa Graça :=> ");
		String nome = entrada.nextLine();
		System.out.println("=======");
		
		System.out.println("E o nome é :=> " + nome  );
		
		entrada.close();
						
	}

}
