package generics;

public class CaixaNumeroTeste {

	public static void main(String[] args) {
		CaixaNumero<Double>  caixaA = new CaixaNumero<> () ;
		CaixaNumero<Integer> caixaB = new CaixaNumero<> () ;
		
		caixaA.guardar(55.99);
		caixaB.guardar(89);
		
		System.out.println(caixaA.abrir());
		System.out.println(caixaB.abrir());

	}

}
