package teste.muitopramuitos;

import infra.DAO;
import modelo.muitoparamuitos.Sobrinho;
import modelo.muitoparamuitos.Tio;

public class NovoTioSobrinho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tio tia1 = new Tio("Azzazzel");
		Tio tio2 = new Tio("Beliel");
		
		Sobrinho sobrinho1 = new Sobrinho("Juninho" );
		Sobrinho sobrinha2 = new Sobrinho("Anne with E" );
		
		tia1.getSobrinhos().add(sobrinho1);
		sobrinho1.getTios().add(tia1);
		
		tia1.getSobrinhos().add(sobrinha2);
		sobrinha2.getTios().add(tia1);
		
		tio2.getSobrinhos().add(sobrinho1);
		sobrinho1.getTios().add(tio2);
		
		tio2.getSobrinhos().add(sobrinha2);
		sobrinha2.getTios().add(tio2);
		
		DAO<Object> dao = new DAO <>();
		
		dao.abrirT()
		.incluir(tia1)
		.incluir(tio2)
		.incluir(sobrinho1)
		.incluir(sobrinha2)
		.fecharT()
		.fechar();
		

	}

}
