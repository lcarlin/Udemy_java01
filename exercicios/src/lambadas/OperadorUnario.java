package lambadas;

import java.util.function.UnaryOperator;

public class OperadorUnario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnaryOperator <Integer> maisDois  = n -> n + 2 ;
		UnaryOperator <Integer> vezesDois = n -> n * 2 ; 
		UnaryOperator <Integer> aoQuadrado = n -> n * n  ; 
		int result1 =  maisDois
						.andThen(vezesDois)
						.andThen(aoQuadrado)
						.apply(0);
				
		System.out.println( result1);
		
		int result2 = aoQuadrado
						.compose(vezesDois)
						.compose(maisDois)
						.apply(0);
		
		System.out.println( result2);

	}

}
