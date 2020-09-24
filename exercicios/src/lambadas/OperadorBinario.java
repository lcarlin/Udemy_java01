package lambadas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryOperator <Double> media = (Double n1, Double n2) -> (n1 + n2 ) / 2 ;
		
		double mediaFinal = media.apply(9.8 , 5.7 );
		
		System.out.println(mediaFinal);
		
		BiFunction<Double, Double, String > resultado = (n1 , n2)  -> {
			double notaFinal =(n1 + n2 ) / 2;
			return notaFinal >= 7 ? "Aprovado! " : "Deu Ruim " ; 		
		} ;
		
		System.out.println(resultado.apply(9.7, 5.3));
		
		
		Function <Double, String > conceito = m -> m >=7 ? "Aprovado! " : "Deu Ruim " ; 
		
		System.out.println(	media.andThen(conceito).apply(9.7, 4.1));

	}

}
