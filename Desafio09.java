package albino;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Desafio09 {

	public static void main(String[] args) {

		StringBuffer menu = new StringBuffer();
		int opcao, quantidadeAlunos, indice, condicaoExcluir;
		String aluno;
		StringBuffer listaAlunos;
		Double media;

		ArrayList<String> alunos = new ArrayList<String>();
		ArrayList<Double> medias = new ArrayList<Double>();

		menu.append("1 - Adicionar aluno e média;");
		menu.append("\n");
		menu.append("2 - Remover aluno e média;");
		menu.append("\n");
		menu.append("3 - Listar todos os alunos;");
		menu.append("\n");
		menu.append("4 - Listar APROVADOS;");
		menu.append("\n");
		menu.append("5 - Listar REPROVADOS;");
		menu.append("\n");
		menu.append("6 - Apagar TODOS;");
		menu.append("\n");
		menu.append("0 - Sair.");

		opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

		while (opcao != 0) {

			// VERSÃO CORRIGIDA PELO MEYER

			switch (opcao) {
			case 1:
				//Adicionar aluno e média
				quantidadeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de alunos você deseja cadastrar?"));

				for (int i = 0; i < quantidadeAlunos; i++) {
					aluno = new String();
					media = new Double(0);

					aluno = JOptionPane.showInputDialog("Digite o nome do aluno ");
					alunos.add(aluno);
					media = Double.parseDouble(JOptionPane.showInputDialog("Digite a média do aluno "+ i +" - "+ alunos.get(i)));

					if (media >= 0 && media <= 10) {


						medias.add(media);
						JOptionPane.showMessageDialog(null, "Alunos adicinados: " + alunos +"\n"+ medias);
					}else {

						JOptionPane.showMessageDialog(null, "Valor inválido");				
						media = Double.parseDouble(JOptionPane.showInputDialog("Digite a média do aluno "+ i +" - "+ alunos.get(i)));
					}
				}
				break;

			case 2:
				//Remover aluno e média
				listaAlunos = new StringBuffer();

				for (int i = 0; i < alunos.size(); i++) {
					listaAlunos.append(i+" - "+alunos.get(i)+": "+medias.get(i));
					listaAlunos.append("\n");
				}

				indice = Integer.parseInt(JOptionPane.showInputDialog("Qual indice de aluno e média você deseja excluir?\n"+listaAlunos));
				condicaoExcluir = JOptionPane.showConfirmDialog(null, "Você deseja excluir o aluno "+ alunos.get(indice)+ " da lista?");

				if (condicaoExcluir == JOptionPane.YES_OPTION) {

					JOptionPane.showMessageDialog(null, "Aluno "+ alunos.get(indice)+ "foi removido da lista.");
					alunos.remove(indice);
					medias.remove(indice);
				}
				break;
			case 3:
				//Listar todos os alunos
				listaAlunos = new StringBuffer();

				for (int i = 0; i < alunos.size(); i++) {
					listaAlunos.append("Aluno: "+alunos.get(i)+"\n");
					listaAlunos.append("Média: "+medias.get(i)+"\n");
					listaAlunos.append("========================================== \n");

				}
				JOptionPane.showMessageDialog(null, "LISTA ALUNOS: \n\n"+listaAlunos);

				break;
			case 4:
				//Listar APROVADOS

				listaAlunos = new StringBuffer();
				for (int i = 0; i < alunos.size(); i++) {


					if (medias.get(i) >=7) {

						listaAlunos.append("Aluno: "+alunos.get(i)+"\n");
						listaAlunos.append("Média: "+medias.get(i)+"\n");
						listaAlunos.append("========================================== \n");

						JOptionPane.showMessageDialog(null, "APROVADOS: \n\n"+listaAlunos);
					}
				}

				break;
			case 5:
				//Listar REPROVADOS
				listaAlunos = new StringBuffer();
				for (int i = 0; i < alunos.size(); i++) {


					if (medias.get(i) <7) {

						listaAlunos.append("Aluno: "+alunos.get(i)+"\n");
						listaAlunos.append("Média: "+medias.get(i)+"\n");
						listaAlunos.append("========================================== \n");

						JOptionPane.showMessageDialog(null, "APROVADOS: \n\n"+listaAlunos);
					}
				}
				break;
			case 6:
				//Apagar TODOS

				listaAlunos = new StringBuffer();
				for (int i = 0; i < alunos.size(); i++) {
					listaAlunos.append("Aluno: "+alunos.get(i)+"\n");
					listaAlunos.append("Média: "+medias.get(i)+"\n");
					listaAlunos.append("========================================== \n");
					condicaoExcluir = JOptionPane.showConfirmDialog(null, "Desejaria apagar todos os alunos da lista? \n"+listaAlunos);

					if (condicaoExcluir == JOptionPane.YES_OPTION) {

						alunos.clear();
						medias.clear();
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
