package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class RemoverUsuario {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		Usuario usuario = em.find(Usuario.class, 7l);
		if (usuario != null ) {
			System.out.println(usuario.getNome());
			em.getTransaction().begin();
			em.remove(usuario);
			em.getTransaction().commit();	
		}										
		em.close();
		emf.close();
	}
}
