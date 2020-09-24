package controle;

import java.util.Scanner;

public class Se {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informa a nota do peão, mano :-> ");
		double media = entrada.nextDouble();
		if (media >= 7 ) {
			System.out.println("O peão passou ");
		} else {
			System.out.println("Vixe, deu ruim ");
		}
		
		entrada.close();
	}

}
