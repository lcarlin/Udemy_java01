package lambadas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
	public static void main(String[] args) {
		Supplier < List < String >> umLIsta = () -> Arrays.asList("Ane", "Bea","Lea","Guy");
		
		System.out.println(umLIsta.get());

	}
}
