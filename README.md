# Cadastro de Alunos de Academia em Java (console)

Sistema de linha de comando para cadastrar alunos de uma academia e registrar as avaliações físicas de cada um ao longo do tempo. Projeto de estudo criado para praticar Programação Orientada a Objetos em Java.

## Por que fiz este projeto

Terminei um curso de orientação a objetos e queria colocar o conteúdo em prática num projeto próprio.

Sou formado em Educação Física e, no meu ambiente de trabalho, o cadastro de alunos e o registro das avaliações físicas não são feitos em um sistema próprio. Por isso escolhi um problema que conheço de perto: um aluno tem um endereço e várias avaliações ao longo do tempo, e cada avaliação reúne bioimpedância, perimetria e dobras cutâneas. Essa estrutura é natural para POO e, ao mesmo tempo, é útil na prática.

## O que o sistema faz

Ao iniciar, o programa pergunta a alternativa desejada. Digite a letra **maiúscula**:

- `A` cadastrar aluno: dados pessoais, endereço e objetivo
- `B` listar todos os alunos, com as avaliações de cada um
- `C` alterar aluno: busca pelo CPF e altera um dado de cada vez (nome, telefone, objetivo, observações, CPF, data de nascimento ou endereço completo)
- `D` excluir aluno: busca pelo CPF e remove o cadastro inteiro, com confirmação dupla
- `E` adicionar avaliação: busca pelo CPF e registra uma nova avaliação com data, bioimpedância, perimetria e dobras cutâneas

Depois de cada ação, o programa pergunta "deseja continuar?" e repete o menu enquanto a resposta for "sim".

Datas são digitadas no formato `dd/mm/aaaa`. Nos números com casa decimal, tanto a vírgula (`70,5`) quanto o ponto (`70.5`) são aceitos.

## Estrutura do projeto

Classes de dados:

- `Aluno`: dados pessoais, um `Endereco` e uma lista de `Avaliacao`
- `Endereco`: rua, número, complemento, bairro, cidade e estado
- `Avaliacao`: data, uma `Bioimpedancia`, uma `Perimetria` e uma `DobrasCutaneas`
- `Bioimpedancia`: 8 medidas (altura, peso, massa muscular, gordura corporal, gordura visceral, taxa metabólica basal, densidade óssea e água corporal total)
- `Perimetria`: 13 medidas (ombro, tórax, cintura, abdômen, quadril e os lados esquerdo e direito de coxa, braço, antebraço e panturrilha)
- `DobrasCutaneas`: 10 dobras (tricipital, bicipital, subescapular, axila média, peitoral, suprailíaca, supraespinal, abdominal, coxa e panturrilha medial)

Classe principal:

- `Main`: menu, leitura dos dados e métodos estáticos de leitura (`lerDouble`, `lerBioimpedancia`, `lerPerimetria` e `lerDobras`)

## O que pratiquei

- Orientação a objetos: classes, atributos privados, construtores, `get` e `set`, `toString()` e composição (o aluno contém um endereço e uma lista de avaliações)
- `ArrayList` para guardar os alunos, e o método `adicionarAvaliacao` na classe `Aluno` para a lista de avaliações
- Repetição do menu com `while` e escolha das opções com `switch`
- `for-each` para percorrer a lista, buscar um aluno pelo CPF e usar `break` quando ele é encontrado
- Conversão de dados: `String` para número (`Double.parseDouble`, `Integer.parseInt`) e `String` para data (`LocalDate` com `DateTimeFormatter`)
- Métodos estáticos para evitar repetição de código na leitura das medidas
- Cuidados com o `Scanner`: uso de `nextLine()` para não deixar o Enter sobrando no buffer
- Fluxo de confirmação antes de excluir um aluno
- Testes manuais, incluindo valores diferentes em cada campo para conferir se cada medida chega ao atributo certo

## Como executar

1. Tenha o JDK (Java Development Kit) instalado.
2. Clone este repositório.
3. Abra o projeto em uma IDE (Eclipse, IntelliJ, VS Code) e execute a classe `Main`.

## Limitações atuais

Este é um projeto de estudo e não deve ser usado com dados reais de alunos.

- Os dados ficam só na memória: ao fechar o programa, tudo é perdido
- Se o usuário digitar texto onde deveria ser número ou data, o programa encerra com erro, em vez de perguntar de novo
- O mesmo CPF pode ser cadastrado mais de uma vez, e a busca sempre encontra o primeiro
- Campos de texto em branco são aceitos
- A classe `Main` concentra muito código (cerca de 330 linhas)

## Próximos passos planejados

- Validar as entradas e perguntar novamente quando o usuário errar, em vez de encerrar o programa
- Impedir CPF repetido
- Dividir o `Main` em métodos menores e classes separadas
- Guardar os dados em um banco de dados (como MySQL ou PostgreSQL)
- Migrar o projeto para Spring Boot, com uma API REST

## Autor

Devluiz, estudante de Engenharia de Software em busca de uma carreira em desenvolvimento back-end.