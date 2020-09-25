package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno a1 = new Aluno ("Anne", 7.1);
		Aluno a2 = new Aluno ("Lea", 6.1);
		Aluno a3 = new Aluno ("Bea", 8.1);
		Aluno a4 = new Aluno ("Guy", 10);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);
		Comparator <Aluno> melhorNota = (aln1, aln2) -> {
			if (aln1.nota > aln2.nota ) return 1 ;
			if (aln1.nota < aln2.nota ) return -1 ;
			return 0 ; 			
		};
		
		Comparator <Aluno> piorNota = (aln1, aln2) -> {
			if (aln1.nota < aln2.nota ) return -1 ;
			if (aln1.nota > aln2.nota ) return 1 ;
			return 0 ; 			
		};
		
		System.out.println(alunos.stream().max(melhorNota).get() );
		System.out.println(alunos.stream().min(piorNota).get() );
		
		System.out.println(alunos.stream().max(piorNota).get() );
		System.out.println(alunos.stream().min(melhorNota).get() );

	}

}



