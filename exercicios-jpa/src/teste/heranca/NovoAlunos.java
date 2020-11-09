package teste.heranca;

import infra.DAO;
import modelo.heranca.Aluno;
import modelo.heranca.AlunoBolsista;

public class NovoAlunos {

	public static void main(String[] args) {
		DAO <Aluno> alunoDAO = new DAO<> () ;
		Aluno aluno1 = new Aluno (123L, "jão");
		AlunoBolsista aluno2 = new AlunoBolsista(345L, "MAria", 1000.00);
		alunoDAO.incluirAtomico(aluno1);
		alunoDAO.incluirAtomico(aluno2);
		alunoDAO.fechar();
	}

}
