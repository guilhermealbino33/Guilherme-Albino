package albino;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Desafio12 {
	
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
	
	public static void main(String[] args) {
		
		String cliente, cnpj, emailCliente, celularCliente, funcionario, cpf, emailFuncionario, celularFuncionario;
		Double valorServico;
		Integer qntServico;
		

		int controle, indice;

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

				controle = jopInt(menuClientes.toString());

				switch (controle) {
				case 1:
					//1 - INCLUIR CLIENTE
					break;
				case 2:
					//2 - ALTERAR CLIENTE
					break;
				case 3:
					//3 - EXCLUIR CLIENTE
					break;
				case 4:
					//3 - LISTAR CLIENTE
					break;
				case 0:
					//0 - VOLTAR AO MENU PRINCIPAL
					controle = jopInt(menu.toString());
					break;

				default:
					break;
				}

				break;
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

				controle = jopInt(menuFuncionarios.toString());

				switch (controle) {
				case 1:
					//1 - INCLUIR FUNCIONARIOS
					break;
				case 2:
					//2 - ALTERAR FUNCIONARIOS
					break;
				case 3:
					//3 - EXCLUIR FUNCIONARIOS
					break;
				case 4:
					//4 - LISTAR FUNCIONARIOS
					break;
				case 0:
					//0 - VOLTAR AO MENU PRINCIPAL
					controle = jopInt(menu.toString());
					break;

				default:
					break;
				}

				break;


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

				controle = jopInt(menuServicos.toString());

				switch (controle) {
				case 1:
					//1 - INCLUIR SERVICO
					break;
				case 2:
					//2 - ALTERAR SERVICO
					break;
				case 3:
					//3 - EXCLUIR
				case 4:
					//4 - LISTAR SERVICOS CADASTRADOS
					break;
				case 0:
					//0 - VOLTAR AO MENU PRINCIPAL
					controle = jopInt(menu.toString());
					break;

				default:
					break;
				}
				break;
				
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

				controle = jopInt(menuVendas.toString());

				switch (controle) {
				case 1:
					//1 - REALIZAR VENDA
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
					controle = jopInt(menu.toString());
					break;

				default:
					break;
				}
				break;
				
			case 0:
				//				0 - SAIR
				break;
			default:
				break;
			}

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
}