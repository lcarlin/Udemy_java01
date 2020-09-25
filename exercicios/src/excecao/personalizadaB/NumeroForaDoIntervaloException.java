package excecao.personalizadaB;

@SuppressWarnings("serial")
public class NumeroForaDoIntervaloException extends Exception {
	private String nomeDoAtributo;
	
	public NumeroForaDoIntervaloException (String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return String.format("O Atribuito '%s' esta fora do intervalo válido ", nomeDoAtributo);
	}
	

}
