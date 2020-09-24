package oo.composicao.desafio;

public class ClienteTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cli1 = new Cliente("Bingão da Quebrada");
		
		Compra crp1 = new Compra() ;
		Compra crp2 = new Compra() ;
		Compra crp3 = new Compra() ;
		
		
		crp1.adicionarItem("Caneta esferografica", 5.9, 3 ) ;
		crp1.adicionarItem(new Produto("Notibuque", 7230.00), 2) ;
		
		crp2.adicionarItem("Lápiz lazuli", 125.3, 9 ) ;
		crp2.adicionarItem(new Produto("desquitopi", 5679.00), 4) ; 
		
		crp3.adicionarItem("a baqueta de O Mago", 1250.3, 1 ) ;
		crp3.adicionarItem(new Produto("Athame Cerimonial", 500.00), 1) ; 
		
		cli1.compras.add(crp1);
		cli1.compras.add(crp2);
		cli1.adicionarCompra(crp3);
		
		System.out.println(cli1.obterValorTotal());

	}

}
