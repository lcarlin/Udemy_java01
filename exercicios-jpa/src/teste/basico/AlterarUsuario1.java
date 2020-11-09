package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario1 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 7l);
		
		
		System.out.println(usuario.getNome());
		usuario.setNome("Dee-Jay-Soul");
		usuario.setEmail("Dee-Jay-Soul@caminhao.com");
		em.merge(usuario);
		
		
		em.getTransaction().commit();
		

		em.close();
		emf.close();

	}

}
