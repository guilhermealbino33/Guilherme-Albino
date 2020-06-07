package albino;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Desafio10 {

	public static void main(String[] args) {

		ArrayList<String> pessoas = new ArrayList<String>();
		ArrayList<Double> pesos = new ArrayList<Double>();
		ArrayList<Integer> idades = new ArrayList<Integer>();


		String pessoa;
		int opcao, indice, condicaoExcluir, idadePessoa,menorIdade;
		Double pesoPessoa, maiorPeso;
		StringBuffer menu = new StringBuffer();
		StringBuffer listaPessoas = new StringBuffer();


		menu.append("1 - Adicionar pessoa;");
		menu.append("\n");
		menu.append("2 - Remover pessoa;");
		menu.append("\n");
		menu.append("3 - Listar pessoas;");
		menu.append("\n");
		menu.append("4 - Mostrar pessoa MAIS JOVEM;");
		menu.append("\n");
		menu.append("5 - Mostrar pessoa MAIS PESADA;");
		menu.append("\n");
		menu.append("6 - Apagar TODOS;");
		menu.append("\n");
		menu.append("0 - Sair.");

		opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

		while (opcao != 0) {

			switch (opcao) {

			case 1:
				//ADICIONAR PESSOA

				pessoa = new String();
				pesoPessoa = new Double(0);

				pessoa = JOptionPane.showInputDialog("Digite o nome da pessoa que você deseja adicionar na lista: ");
				pessoas.add(pessoa);

				idadePessoa = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade de "+pessoa));
				idades.add(idadePessoa);

				pesoPessoa = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso  de "+pessoa));
				pesos.add(pesoPessoa);


				JOptionPane.showMessageDialog(null, pessoa+", idade: "+idadePessoa+", peso: "+pesoPessoa+" kg adicinado (a) na lista");

				break;

			case 2:
				//Remover PESSOA
				listaPessoas = new StringBuffer();
				indice = 0;

				if (pessoas.isEmpty()) {

					JOptionPane.showMessageDialog(null, "Nenhuma pessoa adicionada, impossível remover!");

				} else {

					for (int i = 0; i < pessoas.size(); i++) {
						listaPessoas.append(i+" - "+pessoas.get(i)+": "+idades.get(i)+" anos");
						listaPessoas.append("\n");
					}

					indice = Integer.parseInt(JOptionPane.showInputDialog("Qual indice da pessoa você deseja excluir?\n"+listaPessoas));
					condicaoExcluir = JOptionPane.showConfirmDialog(null, "Você deseja excluir o pessoa "+ pessoas.get(indice)+ " da lista?");

					if (condicaoExcluir == JOptionPane.YES_OPTION) {

						JOptionPane.showMessageDialog(null, "Pessoa "+ pessoas.get(indice)+ "foi removido(a) da lista!");
						pessoas.remove(indice);
						idades.remove(indice);
						pesos.remove(indice);
					}
				}

				break;

			case 3:

				//LISTAR TODOS
				if (pessoas.isEmpty()) {

					JOptionPane.showMessageDialog(null, "Nenhuma pessoa adicionada, impossível listar!");

				} else {
					listaPessoas = new StringBuffer();

					for (int i = 0; i < pessoas.size(); i++) {
						listaPessoas.append("Pessoa: "+pessoas.get(i)+"\n");
						listaPessoas.append("Idade: "+idades.get(i)+" anos\n");
						listaPessoas.append("Peso: "+pesos.get(i)+" kg\n");
						listaPessoas.append("========================================== \n");

					}
					JOptionPane.showMessageDialog(null, "LISTA PESSOAS: \n\n"+listaPessoas);
				}
				break;
			case 4:
				//PESSOA MAIS JOVEM

				menorIdade = 250;
				indice = 0;
				listaPessoas = new StringBuffer();

				for (int i = 0; i < pessoas.size(); i++) {


					if (menorIdade > idades.get(i)) {

						menorIdade = idades.get(i);
						indice = i;

						listaPessoas.append("Pessoa: "+pessoas.get(indice)+"\n");
						listaPessoas.append("Idade: "+idades.get(indice)+" anos\n");
						listaPessoas.append("Peso: "+pesos.get(indice)+" kg\n");
						listaPessoas.append("========================================== \n");

						JOptionPane.showMessageDialog(null, "Pessoa mais jovem encontratoa\n"+listaPessoas);


					}
				}

				break;
			case 5:
				//PESSOA MAIS PESADA
				//CORRIGIDO PELO MEYER
				maiorPeso = 250.0;
				indice = 0;

				listaPessoas = new StringBuffer();

				for (int i = 0; i < pessoas.size(); i++) {


					if (maiorPeso < pesos.get(i)) {

						maiorPeso = pesos.get(i);
						indice = i;

						listaPessoas.append("Pessoa: "+pessoas.get(indice)+"\n");
						listaPessoas.append("Idade: "+idades.get(indice)+" anos\n");
						listaPessoas.append("Peso: "+pesos.get(indice)+" kg\n");
						listaPessoas.append("========================================== \n");

						JOptionPane.showMessageDialog(null, "Pessoa mais PESADA encontratoa\n"+listaPessoas);
					}
				}
				break;
			case 6:
				//Apagar TODOS
				//CORRIGIDO PELO MEYER
				listaPessoas = new StringBuffer();
				for (int i = 0; i < pessoas.size(); i++) {
					listaPessoas.append("Pessoa: "+pessoas.get(i)+"\n");
					listaPessoas.append("Idade: "+idades.get(i)+" anos\n");
					listaPessoas.append("Peso: "+pesos.get(i)+" kg\n");
					listaPessoas.append("========================================== \n");
					condicaoExcluir = JOptionPane.showConfirmDialog(null, "Desejaria apagar todos os alunos da lista? \n"+listaPessoas);

					if (condicaoExcluir == JOptionPane.YES_OPTION) {

						pessoas.clear();
						pesos.clear();
						idades.clear();
						JOptionPane.showMessageDialog(null, "A lista de alunos e suas respectivas médias foram excluídas!");
					}
				}
				break;
			default:

				JOptionPane.showMessageDialog(null, "Opção inválida!");

				break;
			}
			opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
		}

	}	

}




