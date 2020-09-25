package excecao;

public class ChecadaVsNaoChecada {
	public static void main(String[] args) {
		
		try {
			geraErro1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
		try {
			geraErro2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("E chegamos ao final ");
		
	}
	
	static void geraErro1() {
		throw new RuntimeException("Vixe deu pau 01 ");
		
	}
	
	static void geraErro2() throws Exception {
			throw new Exception("Vixe deu pau 02 ");
		
	}

}
