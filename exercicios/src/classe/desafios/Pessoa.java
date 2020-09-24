package classe.desafios;

public class Pessoa {
	
		String nome;
		double peso ;
		Pessoa (String nome, double peso ){
			this.nome = nome; 
			this.peso = peso ;
	}
	
	
	void comner (Comida comida ) {
		if (comida != null )
			this.peso += comida.peso ; 
	}
	
	String apresentar () {
		return "Oi , eu sou o "+this.nome+ " E peso :"+this.peso ;
	}

}
