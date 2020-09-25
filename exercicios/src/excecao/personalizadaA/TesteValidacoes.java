package excecao.personalizadaA;

import excecao.Aluno;

public class TesteValidacoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Aluno aluno = new Aluno ("Anne", -7 ) ;
			Validar.aluno(aluno);
		} catch (StringVaziaException | NumeroForaDoIntervaloException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());		
		}
		
		System.out.println("E é o final ");

	}

}
