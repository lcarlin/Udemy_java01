package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Batimento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno a1 = new Aluno ("Anne", 7.1);
		Aluno a2 = new Aluno ("Lea", 6.1);
		Aluno a3 = new Aluno ("Bea", 8.1);
		Aluno a4 = new Aluno ("Guy", 10);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7 ;
		Predicate<Aluno> reprovado = aprovado.negate();
		
		System.out.println(alunos.stream().allMatch(aprovado));
		
		System.out.println(alunos.stream().anyMatch(aprovado));
		System.out.println(alunos.stream().noneMatch(reprovado));
		


	}

}
