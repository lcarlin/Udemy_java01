package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	final String nome ; 
	final List<Curso> cursos = new ArrayList<> () ;
	
	Aluno  (String nome ){
		this.nome = nome ;
	}
	
	
	void adicionarCurso(Curso curso ){
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Oi����, Sou Um Aluni e minhe nimi � :-=> "  + this.nome ; 
	}

}
