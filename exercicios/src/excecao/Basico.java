package excecao;

public class Basico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aluno a1 = null;
		try {
			imprimirNomeAluno(a1);
		} catch (Exception e) {
			System.out.println("Vixe, deu pau ");

		}
		
		try {
			System.out.println(7/0);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("Ocorreu o erro " + e.getMessage()) ;
		}
		
		System.out.println("FIM ");

	}

	public static void imprimirNomeAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}
}
