package br.com.cod3r.app.financeiro;
import br.com.cod3r.app.calculo.CalculadoraImp ;
import br.com.cod3r.app.calculo.interno.OperacoesAritmeticas;
public class Teste {

	public static void main(String[] args) {
		CalculadoraImp calc = new CalculadoraImp() ;
		System.out.println(calc.soma(2,3,4,5));
		
		OperacoesAritmeticas op = new OperacoesAritmeticas();
		System.out.println(op.soma(3,4,5,6));
		
		System.out.println(CalculadoraImp.class.getName());
		try {
			Field fieldId = CalculadoraImp.class.getDec
			
		}catch (Exception e) {
			e.printStackTrace();
		}


	}

}
