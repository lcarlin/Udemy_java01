package teste.muitopramuitos;

import infra.DAO;
import modelo.muitoparamuitos.Ator;
import modelo.muitoparamuitos.Filme;

public class NovoFilmeAtor {
	public static void main(String[] args) {
		Filme filmeA = new Filme("Pica das GAláxias", 7.8);
		
		Filme filmeb = new Filme("o CARA QUE FOGE", 8.7);
		
		Ator atorA = new Ator ("Han Solon");
		Ator atrizB = new Ator("Princesa Lea");
		
		filmeA.adicionarAtor(atorA);
		filmeA.adicionarAtor(atrizB);
		
		filmeb.adicionarAtor(atorA);
		
		DAO<Filme> dao = new DAO<Filme>() ;
		dao.incluirAtomico(filmeA);
	}

}
