package Project_CadastroAcademia;

import java.time.LocalDate;
import java.util.ArrayList;


public class Aluno {
	private LocalDate datadenascimento;
	private String nome;
	private String cpf;
	private Endereco endereco;
	private String objetivo;
	private String telefone;
	private ArrayList<Avaliacao> avaliacoes;
	private String observacoes;
	public Aluno(LocalDate datadenascimento, String nome, String cpf, Endereco endereco, String objetivo,
			String telefone, String observacoes) {
		super();
		this.datadenascimento = datadenascimento;
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.objetivo = objetivo;
		this.telefone = telefone;
		this.avaliacoes =  new ArrayList<>();
		this.observacoes = observacoes;
	}
	public LocalDate getDatadenascimento() {
		return datadenascimento;
	}
	public void setDatadenascimento(LocalDate datadenascimento) {
		this.datadenascimento = datadenascimento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getObjetivo() {
		return objetivo;
	}
	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public ArrayList<Avaliacao> getAvaliacoes() {
		return avaliacoes;
	}
	
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	
	public void adicionarAvaliacao(Avaliacao av) {
		avaliacoes.add(av);
	}
	
	
	@Override
	public String toString() {
		
		return getDatadenascimento() + ";\n " + getNome()+ ";\n " + getCpf() + ";\n " + getEndereco() + ";\n " + getObjetivo() + ";\n " + getTelefone() +  ";\n " + getObservacoes() + ";\n " + getAvaliacoes() ;
	}
	
	
	
	

}
