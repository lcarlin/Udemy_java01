package generics;

public class CaixaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caixa<String> caixaA = new Caixa<>()  ;
		caixaA.guardar("O Segredo ");
		String coisaA = caixaA.abrir();
		System.out.println(coisaA);
		
		Caixa<Double> caixaB = new Caixa<>();
		caixaB.guardar(55.663);
		Double coisaB = caixaB.abrir();
		System.out.println(coisaB);
		
		

	}

}
