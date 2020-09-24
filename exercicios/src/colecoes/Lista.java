package colecoes;

import java.util.ArrayList;



public class Lista {
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<> () ;
		
		Usuario u1 = new Usuario("Ana");
		
		lista.add(u1);
		lista.add(new Usuario("Betão"));
		lista.add(new Usuario("Pedrinho"));
		lista.add(new Usuario("Luiza"));
		lista.add(new Usuario("Jessika"));
		lista.add(new Usuario("Manoel"));
		
		System.out.println(lista.get(3));

		for (Usuario u : lista) {
			System.out.println(u.nome);
			
		}
		
	}

}
