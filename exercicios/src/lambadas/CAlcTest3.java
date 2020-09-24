package lambadas;

import java.util.function.BinaryOperator;

public class CAlcTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryOperator<Double> calc = (x,y) -> {return x * y ; } ;
		System.out.println(calc.apply(2.0, 3.0));
		
		calc = ( x, y ) -> x * y ;
		System.out.println(calc.apply(2.0, 3.0));
		
		
		
	}
}
