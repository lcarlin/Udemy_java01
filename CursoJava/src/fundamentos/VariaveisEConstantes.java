package fundamentos;

public class VariaveisEConstantes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double raio = 4.5 ; 
		final double PI = 3.1416 ; 
		double area = PI * (raio * raio ) ; 
		
		System.out.println("E a �rea � :-> " + area + " m2 ");
		
		System.out.printf("E a �rea � %f m2 " , area );
		
		System.out.printf("\nE a �rea � %.2f m2 " , area );

	}

}
