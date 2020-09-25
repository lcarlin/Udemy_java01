package excecao.personalizadaA;

@SuppressWarnings("serial")
public class NumeroForaDoIntervaloException extends RuntimeException {
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
