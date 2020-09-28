package generics;

public class Caixa<T> {
	private T coisa ;
	public void guardar (T coisa2) {
		this.coisa = coisa2;
	}
	
	public T abrir () {
		return coisa ; 
	}

}
