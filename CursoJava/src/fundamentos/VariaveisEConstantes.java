package fundamentos;

public class VariaveisEConstantes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double raio = 4.5 ; 
		final double PI = 3.1416 ; 
		double area = PI * (raio * raio ) ; 
		
		System.out.println("E a área é :-> " + area + " m2 ");
		
		System.out.printf("E a área é %f m2 " , area );
		
		System.out.printf("\nE a área é %.2f m2 " , area );

	}

}
