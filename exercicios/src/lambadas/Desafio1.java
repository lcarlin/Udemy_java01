package lambadas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Produto prod = new Produto ("ipad", 3225.56 , 0.13) ;
		
		Function <Produto, Double > precoFinal =
				p -> p.preco * (1 - p.desconto );
				
		UnaryOperator <Double> impostoMunicipal = 
				preco -> preco >= 2500? preco * 1.085 : preco ;
				
		UnaryOperator <Double> frete  =
				preco -> preco >= 3000 ? preco + 100 : preco + 50 ;
				
		UnaryOperator <Double> arrendodar =    // o erro esta aqui 
				preco -> Double.parseDouble( String.format("%.2f", preco));
		
		
		Function <Double, String> formatar =
				preco -> ("R$" + preco).replace(".", ",");
		
		String preco  = precoFinal
						.andThen(impostoMunicipal)
						.andThen(frete)
						.andThen(arrendodar)
						.andThen(formatar)
						.apply(prod);						
		System.out.println("E opreco final é de :=> " + preco );							
	}
}