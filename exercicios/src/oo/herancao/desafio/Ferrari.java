package oo.herancao.desafio;

public class Ferrari extends Carro {
	Ferrari(){
		super(345);	
	}
	
	Ferrari(int velocidadeMax ){
		super(velocidadeMax);
		delta = 15 ;
	}
	
//	@Override
//	void acelarar() {
//		velocidadeAtual +=15 ;
//	}

}
