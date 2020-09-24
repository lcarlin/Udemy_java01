package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Mapa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> emprime = System.out::print ;
		List <String> marcas = Arrays.asList("Austin Martin ", "Peugeot ", "Crysler ");
		
		System.out.println("\n");
		marcas.stream().map(m -> m.toUpperCase()).forEach(emprime);
		
//		UnaryOperator<String> maiuscula = n -> n.toUpperCase() ;
//		UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + " ";
//		UnaryOperator<String> grito = n ->  n + " !!! !! !";
		System.out.println("\n");
		System.out.println(
				Utiliarios.maiuscula.andThen(Utiliarios.primeiraLetra).andThen(Utiliarios::grito).apply("bmw") 
		); 
		System.out.println("\n");
		marcas.stream()
			.map(Utiliarios.maiuscula)
			.map(Utiliarios.primeiraLetra)
			.map(Utiliarios::grito)
			.forEach(emprime);
		

	}

}
