package classe;

public class Iguais {
	public static void main(String[] args) {
		Usuario u1 = new Usuario();
		Usuario u2 = new Usuario();
		u1.nome= "Pedro Silva";
		u1.email = "pedro.silva@exemail.com";
		
		u2.nome= "Pedro Silva";
		u2.email = "pedro.silva@exemail.com";
		System.out.println(u1==u2 );
		System.out.println(u1.equals(u2));												
	}

}
