package lambadas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function <Integer, String > parOuImpar = 
				numero -> numero % 2 == 0 ? "Par" : "Impar" ;
				
				
		Function<String , String > oResultadoE =
				valor -> "O Resultado é " + valor ;
		
		Function<String, String> empolgado = 
				valor -> valor + " !!!";
				
		
				String resultadoFinal = parOuImpar
						.andThen(oResultadoE)
						.andThen(empolgado)
						.apply(232) ;
				
				System.out.println(resultadoFinal);

	}

}
