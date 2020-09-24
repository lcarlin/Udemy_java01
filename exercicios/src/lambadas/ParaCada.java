package lambadas;

import java.util.Arrays;
import java.util.List;

import arrays.ForEach;

public class ParaCada {
	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Ana","Bea","Guy" , "LEa");
		System.out.println("forma tradicional- sem labindas");
		for (String string : aprovados) {
			System.out.println(string);			
		}
		
		System.out.println("\nMetodos 01 de percorrer com labidas");
		// aprovados.forEach((nome)->{System.out.println("Para-Béns para O Aprovado -> " + nome );});
		aprovados.forEach(nome -> meuImprimir(nome));
		
		
		System.out.println("\nMetodos 02 - Method Reference");		
		aprovados.forEach(System.out::println);
		
//		System.out.println("\nMetodos 02 - Method Reference 02");
//		aprovados.forEach(Foreach::meuImprimir);
		
	}
	
	static void meuImprimir (String nome  ) {
		System.out.println("OiÊ, my name is => " +nome  );
	}

}
