package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> usuarios = new HashMap <Integer, String > () ; 
		usuarios.put(1, "bebetão");
		usuarios.put(2, "Betynho ");
		usuarios.put(3, "Olavo");
		usuarios.put(4, "Piroca");
		usuarios.put(2, "Rycardo");
		usuarios.put(5, "Xereka");
		usuarios.put(6, "CArvalho");
		
		System.out.println(usuarios.size());

	}

}
