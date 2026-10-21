package Project_CadastroAcademia;

import java.time.LocalDate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class Persist {
	public static void main(String[] args) {
		Aluno aluno = new Aluno(LocalDate.of(2000,5 ,12 ), "Aluno2teste" , "222200000000" ,null , "teste2","000000000222" , null);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("academiaPU");
		EntityManager em = emf.createEntityManager();
		
		try {
			em.getTransaction().begin();
			em.persist(aluno);
			em.getTransaction().commit();
			
		}catch (Exception e) {
			if(em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			System.out.println(e.getMessage());
			
		} finally {
			em.close();
			emf.close();
			
			
			
		}
			
	}
		
	
	
	

}