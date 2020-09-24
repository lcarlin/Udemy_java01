package oo.composicao;

public class CursosTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno a1 = new Aluno ("Jão") ;
		Aluno a2 = new Aluno ("Pitiu") ;
		Aluno a3 = new Aluno ("moscassino") ;
				
		Curso c1 = new Curso ("Exatas") ;
		Curso c2 = new Curso ("Humanas") ;
		Curso c3 = new Curso ("Bilogicas") ;
		
		c1.adicionarAluno(a1);		
		c1.adicionarAluno(a2);
		
		c2.adicionarAluno(a1);
		c2.adicionarAluno(a3);
		
		a1.adicionarCurso(c3);
		a2.adicionarCurso(c3);
		a3.adicionarCurso(c3);
		
		for (Aluno aluno : c3.alunos) {
			System.out.println("No c1 :=> " + aluno.nome );
		}
		
		System.out.println(a1.cursos.get(0).alunos);
		
		

	}

}

