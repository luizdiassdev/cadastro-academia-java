package Project_CadastroAcademia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ConsultarPorId {
	
	public Aluno consultarId(Integer alunoid) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("academiaPU");
		EntityManager em = emf.createEntityManager();
		
		try {
			Aluno alunocon = em.find(Aluno.class, alunoid);
			return alunocon;
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
			
		} finally {
			em.close();
			emf.close();
			
		}
		
		
		
		
		
	}
	
	
	

	
}
	






