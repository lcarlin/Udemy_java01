package generics;

public class ParesTeste {
	public static void main(String[] args) {
		Pares <Integer, String> resultadoConcurso = new Pares <>() ; 
		resultadoConcurso.adicionar(1, "MAry");
		resultadoConcurso.adicionar(2, "PAul");
		resultadoConcurso.adicionar(3, "Peter");
		resultadoConcurso.adicionar(4, "Bea");
		resultadoConcurso.adicionar(2, "Becca");
		
		System.out.println(resultadoConcurso.getValor(1));
		System.out.println(resultadoConcurso.getValor(4));
	}

}

