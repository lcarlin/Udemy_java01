package fundamentos;

public class FormulaMaluca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numA = Math.pow((6 * (3+2)), 2 ) ; 
		double denA = 3* 2 ; 
		
		double numB = (1-5)*(2-7) ; 
		double denB = 2 ;
				
		double supA = numA / denA ; 
		double supB = Math.pow( (numB/denB),2);
		
		double supFull = Math.pow(supA - supB, 3);
		
		double inf = Math.pow(10, 3);
		
		int finalR = (int) ((int) supFull / inf) ;
		
		System.out.println("Resultado ginal :-> " + finalR );
		

	}

}
