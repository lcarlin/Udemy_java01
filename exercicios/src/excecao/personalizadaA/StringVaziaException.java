package excecao.personalizadaA;

@SuppressWarnings("serial")
public class StringVaziaException  extends RuntimeException {
	private String nomeDoAtributo;
	
	public StringVaziaException (String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return String.format("O Atribuito '%s' esta Vazip  ", nomeDoAtributo);
	}
	
}
