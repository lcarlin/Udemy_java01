package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compra c1 = new Compra() ;
		c1.cliente= "john Peter";
//		c1.itens.add(new Item("Caneta", 21, 8.6 ));
//		c1.itens.add(new Item("Burracha", 12, 3.89 ));
//		c1.itens.add(new Item("Caderno", 8, 18 ));
		
		c1.adicionarItem (new Item("Caneta", 21, 8.6 ));
		c1.adicionarItem (new Item("Burracha", 12, 3.89 ));
		c1.adicionarItem(new Item("Caderno", 8, 18 ));
		
		
		System.out.println(c1.itens.size());
		System.out.println(c1.obterValorTotal());

	}

}
