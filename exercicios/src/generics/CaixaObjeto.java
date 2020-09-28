package generics;

public class CaixaObjeto {
	private Object coisa ;
	public void guardar (Object coisa2) {
		this.coisa = coisa2;
	}
	
	public Object abrir () {
		return coisa ; 
	}
	

}
