package Project_CadastroAcademia;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class CadastroAcademia {

	static double lerDouble(Scanner entrada, String pergunta) {
		System.out.println(pergunta);
		String texto = entrada.nextLine();
		texto = texto.replace(",", ".");
		double numero = Double.parseDouble(texto);
		return numero;
	}

	static Bioimpedancia lerBioimpedancia(Scanner entrada) {
		double altura = lerDouble(entrada, "Altura:");
		double peso = lerDouble(entrada, "Peso:");
		double mm = lerDouble(entrada, "Massa Muscular:");
		double gc = lerDouble(entrada, "Gordura Corporal:");
		double gv = lerDouble(entrada, "Gordura Visceral:");
		double tmb = lerDouble(entrada, "Taxa metabólica basal:");
		double densidadeossea = lerDouble(entrada, "Densidade Óssea:");
		double aguacorporaltotal = lerDouble(entrada, "Água Corporal Total:");

		return new Bioimpedancia(altura, peso, mm, gc, gv, tmb, densidadeossea, aguacorporaltotal);
	}

	static Perimetria lerPerimetria(Scanner entrada) {
		double ombro = lerDouble(entrada, "Ombro:");
		double torax = lerDouble(entrada, "Tórax:");
		double cintura = lerDouble(entrada, "Cintura:");
		double abd = lerDouble(entrada, "Abdômen:");
		double quadril = lerDouble(entrada, "Quadril:");
		double ce = lerDouble(entrada, "Coxa Esquerda:");
		double cd = lerDouble(entrada, "Coxa Direita:");
		double be = lerDouble(entrada, "Braço Esquerdo:");
		double bd = lerDouble(entrada, "Braço Direito:");
		double ae = lerDouble(entrada, "Antebraço Esquerdo:");
		double ad = lerDouble(entrada, "Antebraço Direito:");
		double pd = lerDouble(entrada, "Panturrilha Direita:");
		double pe = lerDouble(entrada, "Panturrilha Esquerda:");

		return new Perimetria(ombro, torax, cintura, abd, quadril, ce, cd, bd, be, ad, ae, pd, pe);
	}

	static DobrasCutaneas lerDobras(Scanner entrada) {
		double tricipital = lerDouble(entrada, "Tricipital:");
		double bicipital = lerDouble(entrada, "Bicipital:");
		double sub = lerDouble(entrada, "Subescapular:");
		double am = lerDouble(entrada, "Axila Média:");
		double peitoral = lerDouble(entrada, "Peitoral:");
		double iliaca = lerDouble(entrada, "Suprailíaca:");
		double espinal = lerDouble(entrada, "Supraespinal:");
		double abdominal = lerDouble(entrada, "Abdominal:");
		double coxa = lerDouble(entrada, "Coxa:");
		double pm = lerDouble(entrada, "Panturrilha Medial:");

		return new DobrasCutaneas(tricipital, bicipital, sub, am, peitoral, iliaca, espinal, abdominal, coxa, pm);
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		boolean continuar = true;
		ArrayList<Aluno> alunos = new ArrayList<>();

		while (continuar) {

			System.out.println("Alternativa:");
			String alternativa = entrada.nextLine();
			switch (alternativa) {

			case "A": // CADASTRAR

				// DADOS DO ALUNO

				System.out.println("-----DADOS DO ALUNO----");

				System.out.println("Nome: ");
				String nome = entrada.nextLine();

				System.out.println("Data de nascimento (dd/mm/aaaa):");
				String texto = entrada.nextLine();
				DateTimeFormatter formatodata = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				LocalDate dataNascimento = LocalDate.parse(texto, formatodata);

				System.out.println("Cpf: ");
				String cpf = entrada.nextLine();

				System.out.println("Objetivo: ");
				String objetivo = entrada.nextLine();

				System.out.println("telefone: ");
				String telefone = entrada.nextLine();

				System.out.println("Observações: ");
				String observacao = entrada.nextLine();

				// ENDEREÇO DO ALUNO
				System.out.println("-----ENDEREÇO DO ALUNO----");

				System.out.println("rua: ");
				String rua = entrada.nextLine();

				System.out.println("número: ");
				String numeroTexto = entrada.nextLine();
				int numero = Integer.parseInt(numeroTexto);

				System.out.println("Complemento: ");
				String complemento = entrada.nextLine();

				System.out.println("Bairro: ");
				String bairro = entrada.nextLine();

				System.out.println("Cidade: ");
				String cidade = entrada.nextLine();

				System.out.println("Estado: ");
				String estado = entrada.nextLine();

				Endereco end = new Endereco(estado, cidade, bairro, rua, numero, complemento);
				Aluno aluno = new Aluno(dataNascimento, nome, cpf, end, objetivo, telefone, observacao);
				alunos.add(aluno);

				break;
			case "B": // LISTAR TODOS

				for (Aluno listartodos : alunos) {
					if (listartodos != null) {
						System.out.println(listartodos);

					} else {
						System.out.println("Nenhum aluno listado!");

					}

				}
				break;
			case "C": // ALTERAR

				Aluno encontrado = null;

				System.out.println("Digite o CPF:");
				String procurar = entrada.nextLine();

				for (Aluno listartodos : alunos) {
					if (listartodos.getCpf().equals(procurar)) {
						encontrado = listartodos;
						System.out.println(
								"O QUE DESEJA ALTERAR: \n 1 - nome \n 2 - telefone \n 3 - objetivo \n 4 - observações \n 5 - Cpf \n 6 - Data de nascimento \n 7 - endereço ");
						String Escolha = entrada.nextLine();

						switch (Escolha) {

						case "1":
							String alterarnome = entrada.nextLine();
							encontrado.setNome(alterarnome);

							break;

						case "2":
							String alterartelefone = entrada.nextLine();
							encontrado.setTelefone(alterartelefone);

							break;

						case "3":
							String alterarobjetivo = entrada.nextLine();
							encontrado.setObjetivo(alterarobjetivo);

							break;
						case "4":
							String alterarobservacoes = entrada.nextLine();
							encontrado.setObservacoes(alterarobservacoes);

							break;
						case "5":
							String alterarcpf = entrada.nextLine();
							encontrado.setCpf(alterarcpf);

							break;

						case "6":
							System.out.println("");
							String alterardata = entrada.nextLine();
							DateTimeFormatter formatodatanasc = DateTimeFormatter.ofPattern("dd/MM/yyyy");
							LocalDate altdatanascimento = LocalDate.parse(alterardata, formatodatanasc);
							encontrado.setDatadenascimento(altdatanascimento);

							break;

						case "7":
							System.out.println("------ALTERANDO ENDEREÇO-----");
							System.out.println("rua: ");
							String alterarrua = entrada.nextLine();
							encontrado.getEndereco().setRua(alterarrua);

							System.out.println("número: ");
							String numeroconv = entrada.nextLine();
							int conv = Integer.parseInt(numeroconv);
							encontrado.getEndereco().setNumero(conv);

							System.out.println("Complemento: ");
							String alterarcomplemento = entrada.nextLine();
							encontrado.getEndereco().setComplemento(alterarcomplemento);

							System.out.println("Bairro: ");
							String alterarbairro = entrada.nextLine();
							encontrado.getEndereco().setBairro(alterarbairro);

							System.out.println("Cidade: ");
							String alterarcidade = entrada.nextLine();
							encontrado.getEndereco().setCidade(alterarcidade);

							System.out.println("Estado: ");
							String alterarestado = entrada.nextLine();
							encontrado.getEndereco().setEstado(alterarestado);

							break;

						}

						break;
					}

				}

				break;

			case "D":
				Aluno encontradoexcluir = null;

				System.out.println("Digite o CPF:");
				String procurarexcluir = entrada.nextLine();

				for (Aluno listartodos : alunos) {
					if (listartodos.getCpf().equals(procurarexcluir)) {
						encontradoexcluir = listartodos;
						System.out.println("DESEJA EXCLUIR TODOS OS DADOS: SIM/NÃO ");
						String escolha = entrada.nextLine();
						if (escolha.equalsIgnoreCase("SIM")) {

							System.out.println(encontradoexcluir);

							System.out.println("Deseja realmente excluir? SIM/NÃO");
							String confirmacao = entrada.nextLine();

							if (confirmacao.equalsIgnoreCase("SIM")) {
								alunos.remove(encontradoexcluir);
								break;
							} else {
								System.out.println("Aluno não foi excluido");
							}

						} else {
							System.out.println("Cadastro não excluido!");
							break;

						}

					}

				}
				if (encontradoexcluir == null) {
					System.out.println("Cadastro não encontrado!");
					break;
				}

				break;

			case "E": // ADICIONAR

				Aluno encontradoAv = null;

				System.out.println("DESEJA ADICIONAR AVALIAÇÃO EM QUAL ALUNO?");

				String addav = entrada.nextLine();

				for (Aluno av : alunos) {

					if (av.getCpf().equals(addav)) {
						encontradoAv = av;
						System.out.println("Aluno encontrado!");

						System.out.println("Data:");
						DateTimeFormatter formatoav = DateTimeFormatter.ofPattern("dd/MM/yyyy");
						String lerdata = entrada.nextLine();
						LocalDate data = LocalDate.parse(lerdata, formatoav);

						Bioimpedancia bioimpedancia = lerBioimpedancia(entrada);

						Perimetria perimetria = lerPerimetria(entrada);

						DobrasCutaneas dobras = lerDobras(entrada);

						Avaliacao novaAvaliacao = new Avaliacao(data, bioimpedancia, perimetria, dobras);

						encontradoAv.adicionarAvaliacao(novaAvaliacao);

						break;

					}
				}

				if (encontradoAv == null) {

					System.out.println("cadastro não encontrado!");
					break;
				}

			}

			System.out.println("deseja continuar?");
			String opcao = entrada.nextLine();

			if (opcao.equalsIgnoreCase("sim")) {
				continuar = true;

			} else {
				continuar = false;
				System.out.println("Volte sempre!");
				break;

			}

		}

	}

}
