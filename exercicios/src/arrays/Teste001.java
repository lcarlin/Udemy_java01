package arrays;

import java.util.Scanner;

public class Teste001 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informa a quantidade de notas a serem computadas :-> ");
		int qtdNotas = entrada.nextInt() ;
		
		double notasAlunoA[] = new double[qtdNotas] ;
		
		System.out.println("===========================================");
		System.out.println("coletando as notas");
		for (int i = 0; i < notasAlunoA.length; i++) {
			System.out.print("Entre com nota # " + (i+1) + " :=> ");
			notasAlunoA[i] = entrada.nextDouble();
		}
		System.out.println("===========================================");
		System.out.println("Gerando a médias ");
		double total = 0 ; 
		
		for(double nota : notasAlunoA ) {
			System.out.println(nota);
			total += nota ;
		}
		System.out.println("E a média do Peão -e :=> " + (total / notasAlunoA.length ) );
		
		entrada.close();
		
	}

}
