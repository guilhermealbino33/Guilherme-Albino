

package albino;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class  Desafio12{

	//CLIENTES
	static ArrayList<String> clientes = new ArrayList<String>();
	static ArrayList<String> cnpjs = new ArrayList<String>();
	static ArrayList<String> emailsClientes = new ArrayList<String>();
	static ArrayList<String> celularesClientes = new ArrayList<String>();

	//FUNCIONARIOS
	static ArrayList<String> funcionarios = new ArrayList<String>();
	static ArrayList<String> cpfs = new ArrayList<String>();
	static ArrayList<String> emailsFuncionarios = new ArrayList<String>();
	static ArrayList<String> celularesFuncionarios = new ArrayList<String>();

	//SERVICOS

	static ArrayList<String> servicos = new ArrayList<String>();
	static ArrayList<Double> valorServicos = new ArrayList<Double>();
	static ArrayList<Integer> qntServicos = new ArrayList<Integer>();

	//VENDAS


	public static void main(String[] args) {

		String cliente, cnpj, emailCliente, celularCliente, funcionario, cpf, emailFuncionario, celularFuncionario, servico;
		Double valorServico;
		Integer qntServico;


		int controle = -1, indice;

		StringBuffer menu = new StringBuffer();
		menu.append("1 - Cadastro clientes");
		menu.append("\n");
		menu.append("2 - Cadastro Funcionários");
		menu.append("\n");
		menu.append("3 - Cadastro Serviços");
		menu.append("\n");
		menu.append("4 - Vendas");
		menu.append("\n");
		menu.append("0 - Sair");


		controle = jopInt(menu.toString());


		while (controle != 0) {



			switch (controle) {


			case 1:
				//				1 -  CLIENTES

				StringBuffer menuClientes = new StringBuffer();
				menuClientes.append("MENU CLIENTES");
				menuClientes.append("\n\n");
				menuClientes.append("1 - Incluir cliente");
				menuClientes.append("\n");
				menuClientes.append("2 - Alterar dados de um cliente");
				menuClientes.append("\n");
				menuClientes.append("3 - Excluir um cliente");
				menuClientes.append("\n");
				menuClientes.append("4 - Listar clientes cadastrados");
				menuClientes.append("\n");
				menuClientes.append("0 - Voltar ao menu principal");


				int controleClientes = -1;
				controleClientes = jopInt(menuClientes.toString());
				while (controleClientes != 0) {

					switch (controleClientes) {
					case 1:
						//1 - INCLUIR CLIENTE
						cliente        = jopStr("Digite o nome do cliente que deseja incluir");
						cnpj           = jopStr("Digite o CNPJ do cliente que deseja incluir");
						emailCliente   = jopStr("Digite o e-mail do cliente que deseja incluir");
						celularCliente = jopStr("Digite o número celular do cliente que deseja incluir");

						//Adicionando dados na lista

						incluirCliente (cliente,cnpj,emailCliente,  celularCliente);

						break;
					case 2:
						//2 - ALTERAR CLIENTE

						indice = 0;
						indice = jopInt(listaIndiceClientes());

						cliente        = jopStr("Digite o novo nome do cliente "+clientes.get(indice));
						cnpj           = jopStr("Digite o CNPJ do cliente que deseja incluir");
						emailCliente   = jopStr("Digite o e-mail do cliente que deseja incluir");
						celularCliente = jopStr("Digite o número celular do cliente que deseja incluir");

						alterarCliente(indice, cliente,cnpj,emailCliente,  celularCliente);

						jop("Cliente "+clientes.get(indice)+ "alterado com sucesso!");
						break;
					case 3:
						//3 - EXCLUIR CLIENTE
						indice = 0;
						indice = jopInt(listaIndiceClientes());
						remClientes(indice);
						break;
					case 4:
						//3 - LISTAR CLIENTE
						jop(listaClientes());
						break;
					case 0:
						//0 - VOLTAR AO MENU PRINCIPAL

						break;

					default:
						jop("Opção Inválida");


						break;
					}

					break;
				}
				controle = jopInt(menu.toString());
			case 2:
				//				2 - FUNCIONARIOS

				StringBuffer menuFuncionarios = new StringBuffer();
				menuFuncionarios.append("MENU FUNCIONÁRIOS");
				menuFuncionarios.append("\n\n");
				menuFuncionarios.append("1 - Cadastrar funcionário");
				menuFuncionarios.append("\n");
				menuFuncionarios.append("2 - Alterar dados de um funcionário");
				menuFuncionarios.append("\n");
				menuFuncionarios.append("3 - Excluir um funcionário");
				menuFuncionarios.append("\n");
				menuFuncionarios.append("4 - Listar funcionários cadastrados");
				menuFuncionarios.append("\n");
				menuFuncionarios.append("0 - Voltar ao menu principal");

				int controleFuncionarios = -1;
				controleFuncionarios = jopInt(menuFuncionarios.toString());
				while (controleFuncionarios != 0) {

					switch (controleFuncionarios) {
					case 1:
						//1 - INCLUIR FUNCIONARIOS
						funcionario        = jopStr("Digite o nome do funcionário que deseja incluir");
						cpf           = jopStr("Digite o CPF do funcionário que deseja incluir");
						emailFuncionario   = jopStr("Digite o e-mail do funcionário que deseja incluir");
						celularFuncionario = jopStr("Digite o número celular do funcionário que deseja incluir");

						//Adicionando dados na lista

						incluirFuncionario (funcionario,cpf,emailFuncionario,  celularFuncionario);

						break;
					case 2:
						//2 - ALTERAR FUNCIONARIOS

						indice = 0;
						indice = jopInt(listaIndiceFuncionarios());

						funcionario        = jopStr("Digite o nome correto do funcionário: ");
						cpf           = jopStr("CPF:");
						emailFuncionario   = jopStr("E-mail:");
						celularFuncionario = jopStr("CELULAR: ");

						alterarFuncionario(indice, funcionario, cpf, emailFuncionario, celularFuncionario);
						jop("Funcionário "+funcionarios.get(indice)+ "alterado com sucesso!");

						break;
					case 3:
						//3 - EXCLUIR FUNCIONARIOS
						indice = 0;
						indice = jopInt(listaIndiceFuncionarios());
						remFuncionarios(indice);


						break;
					case 4:
						//4 - LISTAR FUNCIONARIOS
						jop(listaFuncionarios());

						break;
					case 0:
						//0 - VOLTAR AO MENU PRINCIPAL
						controle = jopInt(menu.toString());
						break;

					default:
						jop("Opção Inválida");
						break;
					}

					break;
				}
				controle = jopInt(menu.toString());

			case 3:
				//				3 - SERVICOS


				StringBuffer menuServicos = new StringBuffer();
				menuServicos.append("MENU SERVIÇOS");
				menuServicos.append("\n\n");
				menuServicos.append("1 - Cadastrar serviço");
				menuServicos.append("\n");
				menuServicos.append("2 - Alterar serviço");
				menuServicos.append("\n");
				menuServicos.append("3 - Exluir um serviço");
				menuServicos.append("\n");
				menuServicos.append("4 - Listar serviços cadastrados");
				menuServicos.append("\n");
				menuServicos.append("0 - Voltar ao menu principal");

				int controleServicos = -1;
				controleServicos = jopInt(menuServicos.toString());
				while (controleServicos != 0) {

					switch (controleServicos) {
					case 1:
						// 1 - INCLUIR SERVICO

						servico = jopStr("Digite o tipo de serviço a ser cadastrado: ");
						valorServico = jopDoub("Digite o valor de "+servico);

						incluirServico(servico, valorServico);

						break;
					case 2:
						//2 - ALTERAR SERVICO
						indice = -1;

						indice = jopInt(listaIndiceServicos());
						servico = jopStr("Digite o índice do serviço a ser alterado: ");
						valorServico = jopDoub("Digite o novo valor de "+servico);

						alterarServico(indice, servico, valorServico);
						break;
					case 3:
						//3 - EXCLUIR
						indice = -1;

						indice = jopInt(listaIndiceServicos());
						remServico(indice);

					case 4:
						//4 - LISTAR SERVICOS CADASTRADOS
						
						listaIndiceServicos();
						break;
					case 0:
						//0 - VOLTAR AO MENU PRINCIPAL
						break;

					default:
						break;
					}
					break;
				}
				controle = jopInt(menu.toString());
			case 4:
				//				4 - VENDAS


				StringBuffer menuVendas = new StringBuffer();
				menuVendas.append("MENU VENDAS");
				menuVendas.append("\n\n");
				menuVendas.append("1 - Realizar venda de serviço");
				menuVendas.append("\n");
				menuVendas.append("2 - Alterar venda de  serviço");
				menuVendas.append("\n");
				menuVendas.append("3 - Exluir uma venda");
				menuVendas.append("\n");
				menuVendas.append("4 - Listar vendas realizadas");
				menuVendas.append("\n");
				menuVendas.append("0 - Voltar ao menu principal");

				int controleVendas = -1;
				controleVendas = jopInt(menuVendas.toString());
				while (controleVendas != 0) {

					switch (controleVendas) {
					case 1:
						//1 TODO - REALIZAR VENDA
						
						//VENDEDOR -> FUNCIONARIO -> PEGAR FUNCIONARIO NA LISTA COM INDICE
						//SERVICO -> PEGAR SERVICO NA LISTA COM INDICE
						//CLIENTE -> PEGAR CLIENTE NA LISTA COM INDICE
						// VALOR -> JÁ VIRÁ COM O SERVICO
						// QUANTIDADE -> DETERMINAR
						// VALOR TOTAL DA VENDA -> MULTIPLICACAO
						
						
						
						break;
					case 2:
						//2 - ALTERAR VENDAS
						break;
					case 3:
						//3 - EXCLUIR VENDAS
						break;
					case 4:
						//4 - LISTAR VENDAS
						break;
					case 0:
						//0 - VOLTAR AO MENU PRINCIPAL
						break;

					default:
						break;
					}
				}
				controle = jopInt(menu.toString());					
				break;
			case 0:
				//				0 - SAIR
				break;
			default:
				break;
			}

		}

	}
	public static String jopStr(String mensagem) {

		String texto = "";
		texto = JOptionPane.showInputDialog(mensagem);
		return texto;
	}

	public static Integer jopInt(String mensagem) {

		Integer numero = 0;
		numero = Integer.parseInt(JOptionPane.showInputDialog(mensagem));
		return numero;
	}

	public static Double jopDoub(String mensagem) {

		Double numero = 0.0;
		numero = Double.parseDouble(JOptionPane.showInputDialog(mensagem));
		return numero;
	}

	public static void jop(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
	}

	public static void incluirCliente (String cliente, String cnpj, String emailCliente, String celularCliente) {
		clientes.add(cliente);
		cnpjs.add(cnpj);
		emailsClientes.add(emailCliente);
		celularesClientes.add(celularCliente);
		jop("Cliente Adicionado!");

	}
	public static void alterarCliente (int indice, String cliente, String cnpj, String emailCliente, String celularCliente) {

		clientes.remove(indice);
		clientes.add(cliente);
		cnpjs.remove(indice);
		cnpjs.add(cnpj);
		emailsClientes.remove(indice);
		emailsClientes.add(emailCliente);
		celularesClientes.remove(indice);
		celularesClientes.add(celularCliente);

	}


	public static void remClientes (int indice) {

		clientes.remove(indice);
		cnpjs.remove(indice); 
		emailsClientes.remove(indice);
		celularesClientes.remove(indice);
		jop("Cliente Indice "+indice+  " foi removido! ");

	}
	public static String listaClientes () {
		StringBuffer listaClientes = new StringBuffer();
		listaClientes.append("Lista de clientes!");
		listaClientes.append("\n");
		listaClientes.append("========================");
		listaClientes.append("\n");

		for (int i = 0; i < clientes.size(); i++) {

			listaClientes.append("Cliente: ");
			listaClientes.append(clientes.get(i));
			listaClientes.append("\n");
			listaClientes.append("Cnpj ");
			listaClientes.append(cnpjs.get(i));
			listaClientes.append("\n");
			listaClientes.append("Email: ");
			listaClientes.append(emailsClientes.get(i));
			listaClientes.append("\n");
			listaClientes.append("Celular: ");
			listaClientes.append(celularesClientes.get(i));
			listaClientes.append("\n");
			listaClientes.append("========================");
			listaClientes.append("\n");
		}
		return listaClientes.toString();
	}
	public static String listaIndiceClientes () {
		StringBuffer lista = new StringBuffer();
		lista.append("Lista de Clientes por índice!");
		lista.append("\n");
		lista.append("========================");
		lista.append("\n");

		for (int i = 0; i < clientes.size(); i++) {
			lista.append(i+" - Cliente: "+clientes.get(i)+" Celular: "+celularesClientes.get(i));
			lista.append("\n");

		}
		return lista.toString();
	}


	public static void incluirFuncionario (String funcionario, String cpf, String emailFuncionario, String celularFuncionario) {
		funcionarios.add(funcionario);
		cpfs.add(cpf);
		emailsFuncionarios.add(emailFuncionario);
		celularesFuncionarios.add(celularFuncionario);
		jop("Funcionário Adicionado!");
	}

	public static void alterarFuncionario (int indice, String funcionario, String cpf, String emailFuncionario, String celularFuncionario) {

		funcionarios.remove(indice);
		funcionarios.add(funcionario);
		cpfs.remove(indice); 
		cpfs.add(cpf);
		emailsFuncionarios.remove(indice);
		emailsFuncionarios.add(emailFuncionario);
		celularesFuncionarios.remove(indice);
		celularesFuncionarios.add(celularFuncionario);
	}


	public static void remFuncionarios (int indice) {

		funcionarios.remove(indice);
		cpfs.remove(indice); 
		emailsFuncionarios.remove(indice);
		celularesFuncionarios.remove(indice);
		jop("Funcionário Indice "+indice+  " foi removido! ");


	}    		

	public static String listaFuncionarios () {
		StringBuffer listaFuncionarios = new StringBuffer();
		listaFuncionarios.append("Lista de Funcionários!");
		listaFuncionarios.append("\n");
		listaFuncionarios.append("========================");
		listaFuncionarios.append("\n");

		for (int i = 0; i < funcionarios.size(); i++) {
			listaFuncionarios.append("Funcionário: ");
			listaFuncionarios.append(funcionarios.get(i));
			listaFuncionarios.append("\n");
			listaFuncionarios.append("CPF ");
			listaFuncionarios.append(cpfs.get(i));
			listaFuncionarios.append("\n");
			listaFuncionarios.append("Email: ");
			listaFuncionarios.append(emailsFuncionarios.get(i));
			listaFuncionarios.append("\n");
			listaFuncionarios.append("Celular: ");
			listaFuncionarios.append(celularesFuncionarios.get(i));
			listaFuncionarios.append("\n");
			listaFuncionarios.append("========================");
			listaFuncionarios.append("\n");
		}
		return listaFuncionarios.toString();
	}
	public static String listaIndiceFuncionarios () {
		StringBuffer lista = new StringBuffer();
		lista.append("Lista de Funcionários por índice!");
		lista.append("\n");
		lista.append("========================");
		lista.append("\n");

		for (int i = 0; i < funcionarios.size(); i++) {
			lista.append(i+" - Funcionário: "+funcionarios.get(i)+" Celular: "+celularesFuncionarios.get(i));
			lista.append("\n");

		}
		return lista.toString();
	}















	public static void incluirServico (String servico, Double valorServico) {
		servicos.add(servico);
		valorServicos.add(valorServico);

		jop("Serviço Adicionado!");

	}
	public static void alterarServico (int indice, String servico, Double valorServico) {

		servicos.remove(indice);
		servicos.add(servico);
		valorServicos.add(valorServico);
		valorServicos.remove(indice);

	}


	public static void remServico (int indice) {

		servicos.remove(indice);
		valorServicos.remove(indice);

		jop("Cliente Indice "+indice+  " foi removido! ");

	}
	public static String listaServico() {
		StringBuffer lista = new StringBuffer();
		lista.append("Lista de Serviços!");
		lista.append("\n");
		lista.append("========================");
		lista.append("\n");

		for (int i = 0; i < servicos.size(); i++) {

			lista.append("Servico: "+ servicos.get(i));
			lista.append("\n");
			lista.append("Valor R$" + cnpjs.get(i));
			lista.append("\n");
			lista.append("========================");
			lista.append("\n");
		}
		return lista.toString();
	}
	public static String listaIndiceServicos() {
		StringBuffer lista = new StringBuffer();
		lista.append("Lista de Serviços com índice!");
		lista.append("\n");
		lista.append("========================");
		lista.append("\n");

		for (int i = 0; i < servicos.size(); i++) {

			lista.append(i + "Serviço: "+ servicos.get(i));
			lista.append("\n");
		}
		return lista.toString();
	}
}  

