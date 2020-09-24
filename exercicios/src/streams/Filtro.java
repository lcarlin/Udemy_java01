package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filtro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno a1 = new Aluno ("Ane", 7.8);
		Aluno a2 = new Aluno ("Bea", 5.8);
		Aluno a3 = new Aluno ("Lea", 9.8);
		Aluno a4 = new Aluno ("Guy", 7.1);
		Aluno a5 = new Aluno ("Peter", 8.0);
		Aluno a6 = new Aluno ("Becca", 4.8);
		
		List <Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		Predicate <Aluno> aprovado = a -> a.nota >= 7 ;
		Function <Aluno, String> saudacaoAprovado = a -> "Para-bens " + a.nome + "! Vc esta aprovado ";
		
		alunos.stream()
			.filter(aprovado)
			.map( saudacaoAprovado )
			.forEach(System.out::println);
		
		

	}

}

