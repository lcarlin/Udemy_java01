package modelo.muitoparamuitos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Tio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	private String nome ;
	
	@ManyToMany
	private List<Sobrinho> sobrinhos = new ArrayList<>();


	public Tio(String nome) {
		this.nome = nome;
	}
	
	public Tio () {
		
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Sobrinho> getSobrinhos() {
		return sobrinhos;
	}

	public void setSobrinhos(List<Sobrinho> sobrinhos) {
		this.sobrinhos = sobrinhos;
	}
}
