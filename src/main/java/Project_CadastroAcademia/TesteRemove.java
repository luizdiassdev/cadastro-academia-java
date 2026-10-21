package Project_CadastroAcademia;

public class TesteRemove {
	public static void main(String[] args) {
		
		
		RemoverAluno remove = new RemoverAluno();
		boolean excluir = remove.remove(999);
		
		if(excluir == true) {
			
			System.out.println("Excluido com sucesso!");
		
		}else {
			
			System.out.println("Nada foi excluido");
		}
	
	}

}
