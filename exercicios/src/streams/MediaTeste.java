package streams;

public class MediaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Media m1 = new Media ().adicionar(8.4).adicionar(6.6) ;
		Media m2 = new Media ().adicionar(8.5).adicionar(6.5) ;
		// m1.adicionar(8.3);
		// m1.adicionar(6.7);
		System.out.println(m1.getValor());
		System.out.println(m2.getValor());
		
		System.out.println(
		Media.combinar(m1, m2).getValor());

	}

}
