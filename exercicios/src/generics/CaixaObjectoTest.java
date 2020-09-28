package generics;

public class CaixaObjectoTest {
	public static void main(String[] args) {
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.guardar(2.3);//
		Double coisa = (Double) caixaA.abrir() ;
		
		CaixaObjeto caixaB = new CaixaObjeto();
		caixaB.guardar("Teste de coisas ");
		String coisa2 = (String) caixaB.abrir();
		
		
	}

}
