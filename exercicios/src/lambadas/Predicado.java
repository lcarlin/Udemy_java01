package lambadas;
import java.util.function.Predicate;

public class Predicado {
	public static void main(String[] args) {
		Predicate <Produto> isCaro = 
				prod -> (  prod.preco  * ( 1 - prod.desconto)>= 30000 ) ;
		
		Produto produto = new Produto("Notibuue épou", 54999.99, 0.15 );
		System.out.println(isCaro.test(produto));
				
	}

}
