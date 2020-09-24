package controle;

import java.util.Scanner;

public class DiasDaSemana {
	public static void main(String[] args) {
		int numeroDia = 0 ;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informa O dia sa semana :-> ");
		String diaSemana = entrada.nextLine () ;
		
		if (diaSemana.equalsIgnoreCase("domingo")) {
			numeroDia = 1;
		} else {
			if (diaSemana.equalsIgnoreCase("Segunda")) {
				numeroDia = 2;
			} else {
				if (diaSemana.equalsIgnoreCase("terça")) {
					numeroDia = 3;
				} else {
					if (diaSemana.equalsIgnoreCase("quarta")) {
						numeroDia = 4;
					} else {
						if (diaSemana.equalsIgnoreCase("quinta")) {
							numeroDia = 5;
						} else {
							if (diaSemana.equalsIgnoreCase("sexta")) {
								numeroDia = 6;							
							} else {
								if (diaSemana.equalsIgnoreCase("sábado")) {
									numeroDia =7;
								} else {
									System.out.printf("Dia da semana %s e invalido \n" , diaSemana);
								}
							}
						}
					}
				}
			}
		}
		
		System.out.println("E o numero do dia da semana é :=> " + numeroDia );
		
		
		
		
		
		
		
		
		
		
		
		entrada.close();
	}

}
