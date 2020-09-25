package streams;

import java.util.Arrays;
import java.util.List;

public class OutrosMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Aluno a1 = new Aluno ("Anne", 7.1);
		Aluno a2 = new Aluno ("Lea", 6.1);
		Aluno a3 = new Aluno ("Bea", 8.1);
		Aluno a4 = new Aluno ("Guy", 10);
		Aluno a5 = new Aluno ("Gaby", 7.1);
		Aluno a6 = new Aluno ("Lea", 6.1);
		Aluno a7 = new Aluno ("Bea", 8.1);
		Aluno a8 = new Aluno ("Mary", 10);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6,a7,a8);
		
		System.out.println("Distinc ... .. . :-=> ");
		alunos.stream()
			.distinct()
			.forEach(System.out::println);
		
		System.out.println("\nSkip/Limit");
		alunos.stream()
			.distinct()
			.limit(2)
			.skip(1)
			.forEach(System.out::println);
		
		System.out.println("\nTake/While");
		alunos.stream()
			.distinct()
			.takeWhile(a -> a.nota > 7 )		
			.forEach(System.out::println);						
	
	}
	
	

}
