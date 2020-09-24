package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<> () ;
		
		fila.add("Anna");
		fila.offer("O Papa");
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafael ");
		fila.offer("O GUI ");
	}

}
