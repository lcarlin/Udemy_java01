package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoAssentoCliente2 {

	public static void main(String[] args) {
		Assento assento = new Assento ("4D");
		Cliente cliente =  new Cliente ("Big Richard", assento);
		DAO<Cliente> dao = new DAO<>(Cliente.class);
		dao.incluirAtomico(cliente);
			
	}

}
