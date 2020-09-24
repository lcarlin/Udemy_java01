package lambadas;

public class Produto extends Object {
	final String nome ;
	final double preco ;
	final double desconto ;

	public Produto(String nome, double preco, double desconto) {
		
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome; " + nome + " /  Preco Full: "+  preco + " / Preco com desconto " + (preco * (1-desconto)) ; 
	}

}