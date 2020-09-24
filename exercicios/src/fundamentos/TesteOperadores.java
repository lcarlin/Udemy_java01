package fundamentos;

public class TesteOperadores {
	public static void main(String[] args) {
		boolean trabalho1 = false ;
		boolean trabalho2 = true ; 
		
		boolean comprouTV50 = trabalho1 && trabalho2 ;
		boolean comprouTV32 = trabalho1 ^  trabalho2 ;
		boolean comprouSorvete = comprouTV50 || comprouTV32 ;
		boolean maisSaude = !comprouSorvete ; 
		
		System.out.println("Comprou a TV de 50 ? " + comprouTV50 );
		System.out.println("Comprou a TV de 32 ? " + comprouTV32 );
		System.out.println("Comprou sorvetes   ? " + comprouSorvete );
		System.out.println("TTa mais saude     ? " + maisSaude );										
	}

}
