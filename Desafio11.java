package albino;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Desafio11 {

	// NOME
	static ArrayList<String> nomes = new ArrayList<String>();
	// EMAIL
	static ArrayList<String> emails = new ArrayList<String>();
	// CELULAR
	static ArrayList<String> celulares = new ArrayList<String>();
	// GENERO
	static ArrayList<Character> generos = new ArrayList<Character>();
	// IDADE
	static ArrayList<Integer> idades = new ArrayList<Integer>();

	public static void main(String[] args) {

		String nome, email, celular;
		Character genero;
		Integer idade, tipoGenero, indice, condicaoExcluir;

		StringBuffer menu = new StringBuffer();
		menu.append("1 - Adicionar um Contato");
		menu.append("\n");
		menu.append("2 - Remover um Contato");
		menu.append("\n");
		menu.append("3 - Listar Contatos");
		menu.append("\n");
		menu.append("4 - Apenas por Gênero");
		menu.append("\n");
		menu.append("5 - Pesquisar");
		menu.append("\n");
		menu.append("0 - Sair");

		int controle;

		controle = jopInt(menu.toString());

		while (controle != 0) {

			switch (controle) {
			case 1:
				// 1 - Adicionar um Contato

				nome = jopStr("Digite o nome do contato:");
				email = jopStr("Digite o email de " + nome);
				celular = jopStr("Digite o celular de " + nome);
				tipoGenero = jopInt("Escolha o gênero: \n 0 - Masculino \n 1 - Feminino");
				if (tipoGenero == 0) {
					genero = 'M';
				} else {
					genero = 'F';
				}
				idade = jopInt("Digite a idade de " + nome);

				addContato(nome, email, celular, genero, idade);

				break;
			case 2:
				// 2 - Remover um Contato
				indice = 0;
				verificarVazio();

				indice = jopInt(listarIndiceContatos());
				condicaoExcluir = JOptionPane.showConfirmDialog(null,
						"Você deseja excluir o contato " + nomes.get(indice) + " da lista?");

				if (condicaoExcluir == JOptionPane.YES_OPTION) {

					jop("Contato " + nomes.get(indice) + " foi REMOVIDO(A) da lista!");
					remContato(indice);

				}

				break;

			case 3:
				// 3 - Listar Contatos
				if (nomes.isEmpty()) {
					verificarVazio();
				} else {

					jop(listarContatos());

				}


				break;
			case 4:
				// 4 - Apenas por Gênero
				// FILTAR A ARRAY DE GENERO COM UM IF ELSE, PEGAR O INDICE DO GENERO E JOGAR NAS
				// OUTRAS ARRAYS PARA PRINTAR
				if (nomes.isEmpty()) {
					verificarVazio();
				} else {
					tipoGenero = jopInt("Escolha o gênero: \n 0 - Masculino \n 1 - Feminino");

					if (tipoGenero == 0) {
						jop(listarPorGenero('M'));
					} else {
						jop(listarPorGenero('F'));
					}
				}
				break;
			case 5:
				// 5 - Pesquisar
				String pesquisa = "";
				
				if (nomes.isEmpty()) {
					verificarVazio();
				} else {
				pesquisa = jopStr("Digite o nome do contato que você deseja pesquisar:" );

				jop(pesquisar(pesquisa));

				}

				break;
			case 0:
				// 0 - Sair

				break;
			default:
				// Opção inválida

				jop("Opção Inválida!");

				break;
			}

			controle = jopInt(menu.toString());

		}
	}

	public static Integer jopInt(String mensagem) {

		Integer numero = 0;
		numero = Integer.parseInt(JOptionPane.showInputDialog(mensagem));
		return numero;
	}

	public static String jopStr(String mensagem) {

		String texto = "";
		texto = JOptionPane.showInputDialog(mensagem);
		return texto;
	}

	public static void jop(String msg) {

		JOptionPane.showMessageDialog(null, msg);
	}

	public static void addContato(String nome, String email, String celular, Character genero, Integer idade) {

		nomes.add(nome);
		emails.add(email);
		celulares.add(celular);
		generos.add(genero);
		idades.add(idade);

		jop("Contato adicionado com sucesso!");

	}

	public static void remContato(Integer indice) {

		nomes.remove(nomes.get(indice));
		emails.remove(emails.get(indice));
		celulares.remove(celulares.get(indice));
		generos.remove(generos.get(indice));
		idades.remove(idades.get(indice));

	}

	public static String listarContatos() {

		StringBuffer lista = new StringBuffer();
		lista.append("Lista de Contatos: ");
		lista.append("\n");
		lista.append("========================================");
		lista.append("\n");

		for (int i = 0; i < nomes.size(); i++) {

			lista.append("Nome: ");
			lista.append(nomes.get(i));
			lista.append("\n");
			lista.append("E-mail: ");
			lista.append(emails.get(i));
			lista.append("\n");
			lista.append("Celular: ");
			lista.append(celulares.get(i));
			lista.append("\n");
			lista.append("Gênero: ");
			lista.append(generos.get(i));
			lista.append("\n");
			lista.append("Idade: ");
			lista.append(idades.get(i) + " anos");
			lista.append("\n");
			lista.append("========================================");
			lista.append("\n");

		}
		return lista.toString();
	}

	public static String listarIndiceContatos() {

		StringBuffer lista = new StringBuffer();

		for (int i = 0; i < nomes.size(); i++) {
			lista.append(i + " - " + nomes.get(i) + ": " + idades.get(i) + " anos");
			lista.append("\n");
		}

		return lista.toString();

	}

	public static String listarPorGenero(Character g) {
		System.out.println("entrou GENERO "+g);
		StringBuffer lista = new StringBuffer();
		lista.append("Lista de contatos: ");
		lista.append("\n");
		lista.append("========================================");
		lista.append("\n");

		for (int i = 0; i < nomes.size(); i++) {

			if (generos.get(i).equals(g)) {

				lista.append("Nome: ");
				lista.append(nomes.get(i));
				lista.append("\n");
				lista.append("E-mail: ");
				lista.append(emails.get(i));
				lista.append("\n");
				lista.append("Celular: ");
				lista.append(celulares.get(i));
				lista.append("\n");
				lista.append("Gênero: ");
				lista.append(generos.get(i));
				lista.append("\n");
				lista.append("Idade: ");
				lista.append(idades.get(i) + " anos");
				lista.append("\n");
				lista.append("========================================");
				lista.append("\n");
			} 
			jop("Contato não encontrato!");

		}
		return lista.toString();
	}

	public static void verificarVazio() {

		if (nomes.isEmpty()) {

			jop("Nenhum contato adicionado, impossível cumprir ação!");

		} 
	}
	public static String pesquisar(String parametro) {

		System.out.println("entrou PESQUISA "+parametro);
		StringBuffer lista = new StringBuffer();

		if (!parametro.isEmpty()) {


			lista.append("Resultado da busca: ");
			lista.append("\n");
			lista.append("========================================");
			lista.append("\n");

			for (int i = 0; i < nomes.size(); i++) {

				if (nomes.get(i).contains(parametro)) {

					lista.append("Nome: ");
					lista.append(nomes.get(i));
					lista.append("\n");
					lista.append("E-mail: ");
					lista.append(emails.get(i));
					lista.append("\n");
					lista.append("Celular: ");
					lista.append(celulares.get(i));
					lista.append("\n");
					lista.append("Gênero: ");
					lista.append(generos.get(i));
					lista.append("\n");
					lista.append("Idade: ");
					lista.append(idades.get(i) + " anos");
					lista.append("\n");
					lista.append("========================================");
					lista.append("\n");
				} 
			}

		} else {
			System.out.println("entrou PESQUISA SEM PARAMETRO");
			lista.append("Favor digitar algo para pesquisar!");
			lista.append("\n");
			
		} 
		return lista.toString();

	}
}