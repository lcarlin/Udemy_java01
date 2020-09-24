package classe;

public class Usuario {
	String nome;
	String email;

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Usuario) {
			Usuario outro = (Usuario) obj ; 
			boolean nomeIgual  = this.nome.equals(outro.nome);
			boolean emailIgual = this.email.equals(outro.email) ; 			
			return (nomeIgual && emailIgual );
		} else {
			return false ;
		}
	}
}