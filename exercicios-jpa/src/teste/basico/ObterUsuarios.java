package teste.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class ObterUsuarios {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
//		String jpql = "Select u from Usuario u ";
//		TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
//		query.setMaxResults(5);
//		List<Usuario> usuarios = query.getResultList();
		
		// Better WAY ???
		List<Usuario> usuarios = em.createQuery("Select u from Usuario u ", Usuario.class)
				.setMaxResults(99)
				.getResultList();
		
		for (Usuario usu1 : usuarios) {
			System.out.println("ID :=> " + usu1.getId() + "; My Name Is :=> " + usu1.getNome() + "; e-mail :=> "+ usu1.getEmail());
		}		
		em.close();
		emf.close();
	}
}
