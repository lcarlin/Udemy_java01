package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {
	public static void main(String[] args) {
		Produto produto = new Produto("monitor de 24\"" ,789.98);
		DAO<Produto> dao = new DAO<>(Produto.class);
		// dao.abrirT().incluir(produto).fecharT().fechar();
		dao.incluirAtomico(produto).fechar();
		System.out.println("IDe do produto criado :=> " + produto.getId());
		
	}
}
