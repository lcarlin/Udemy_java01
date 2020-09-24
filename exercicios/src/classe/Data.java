package classe;

public class Data {
	int dia ;
	int mes ;
	int ano ;
	
	Data() {
		this(1,1,1970 );
//		dia = 01 ;
//		mes = 01;
//		ano = 1970 ; 
	}
	
	Data (int d, int m , int a ){
		this.dia = d;
		this.mes = m;
		this.ano = a;			
	}
	
	public String obterDataFormatada () {
		//return dia +"/"+mes+"/" + ano ;
		return String.format("%d/%d/%d", dia, mes, ano );
	}
	
	
	@Override
	public String toString() {
		
		return "E a data é :=> " + dia +" de " + mes + " de " + ano ;
	}
}
