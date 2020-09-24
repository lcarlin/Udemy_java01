package classe;

public class DataTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Data d1 = new Data() ;
		Data d2 = new Data(25,8,1979) ;
		Data d3 = new Data() ;
		
		d1.dia = 28 ;
		d1.mes =  02 ;
		d1.ano = 1977 ; 
		
		

		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());

	}

}
