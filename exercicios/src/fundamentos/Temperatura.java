package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		final double fatorAjuste =  32 ; 
		final double fatorConv = 5 /9.0 ;
		final double grausF = 86 ; // esse aqui � quem se altera 
		// double grausC = 0.0 ; 		

		double  grausC =  ((grausF - fatorAjuste ) * (5/9.0)) ;  /// aqui tem que dar 54
		
		System.out.println("************************************");
		System.out.println("FAtor        => " + fatorConv );
		System.out.println("FAtor Ajuste => " + fatorAjuste );
		System.out.println("Valor em �F  => " + grausF);
		System.out.println("Valor em �c  => " + grausC);
		System.out.println("Valor em �c  => " + ( (grausF - fatorAjuste ) * fatorAjuste ));
		System.out.println("vesezxs => " + (grausF - fatorAjuste ));
		
	}

}
