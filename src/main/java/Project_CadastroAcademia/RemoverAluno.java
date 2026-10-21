package Project_CadastroAcademia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class RemoverAluno {
	
	public boolean remove(Integer alunoid) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("academiaPU");
		EntityManager em = emf.createEntityManager();
	
	try {
			if(alunoid != null) {
				
			em.getTransaction().begin();
			
			Aluno aluno = em.find(Aluno.class, alunoid);
			
				if(aluno != null) {
					
					em.remove(aluno);
					em.getTransaction().commit();
			
					System.out.println("Aluno com ID " + aluno.getId() + " removido");
					return true;
				
				} else {
					System.out.println("Aluno não existe");
					em.getTransaction().rollback();
					
				}
			
			} else {
				
				
				System.out.println("Id não existe!");
				
			}
			
			return false;
	} catch (Exception e) {
		
		if(em.getTransaction().isActive()) {
			em.getTransaction().rollback();
		}
		System.out.println(e.getMessage());
		return false;
		
		
	}finally {
		em.close();
		emf.close();
		
	}

	}

}
		
	
	
