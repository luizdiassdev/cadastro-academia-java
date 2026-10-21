package Project_CadastroAcademia;



public class TesteConsulta {
	public static void main(String[] args) {
		ConsultarPorId consultar = new ConsultarPorId();
		Aluno aluno = consultar.consultarId(1);
		
		if(aluno != null) {
		System.out.println(aluno);
		
		
	}
	
}
	
}
