package classe.desafios;

public class Jantar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comida c1 = new Comida ("Arroz", 0.2333) ; 
		Comida c2 = new Comida ("Feijão", 0.2333) ;
		
		Pessoa p1 = new Pessoa("Jão", 99.8) ;
		
		System.out.println(p1.apresentar());
		
		p1.comner(c1);
		System.out.println(p1.apresentar());
		
		p1.comner(c2);
		System.out.println(p1.apresentar());

	}

}
