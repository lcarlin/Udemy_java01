package oo.herancao.desafio;

public class Carro {
	
	final int VELOCIDADE_MAXIMA ; 
	
	int velocidadeAtual;
	int delta = 5 ;
	Carro (int ValVelocMax ){
		VELOCIDADE_MAXIMA = ValVelocMax ; 
		
	}
	
	void acelarar () {
		if (velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA ; 
			
		} else {
		velocidadeAtual += delta ;
		}
	}
	
	void frear () {
		if (velocidadeAtual >= 5 ) {
			velocidadeAtual-=5 ; 
		} else {
			velocidadeAtual = 0 ;
		}
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "E a velocidade atual é :=> " + velocidadeAtual +" KM/H" ;
	}

}
