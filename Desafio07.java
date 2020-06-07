package albino;


import javax.swing.JOptionPane;


public class Desafio07 {
	
	

	public static void main(String[] args) {


		String menu, texto, letra1;

		int opcao, tamanhoFrase;

		menu = "Menu: \n\n"
				+ "1 - Deixar o texto em Caixa Alta\n"
				+ "2 - Deixar o texto em Caixa Baixa \n"
				+ "3 - Soletrar uma palavra \n"
				+ "4 - Substituir determinado caracter por @ \n"
				+ "5 - Cortar uma frase em determinada posição \n"
				+ "0 - Sair";

		opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));



		while (opcao != 0) {

			switch (opcao) {

			case 1:

				texto = JOptionPane.showInputDialog("Digite o texto que você deseja deixar em Caixa Alta:");

				JOptionPane.showMessageDialog(null, texto.toUpperCase());

				break;

			case 2:

				texto = JOptionPane.showInputDialog("Digite o texto que você deseja deixar em Caixa Baixa:");

				JOptionPane.showMessageDialog(null, texto.toLowerCase());

				break;

			case 3:

				texto = JOptionPane.showInputDialog("Digite o texto que você deseja Soletrar:");

				for (int i = 0; i < texto.length(); i++) {

					JOptionPane.showMessageDialog(null, texto.charAt(i));

				}

				break;

			case 4:

				texto = JOptionPane.showInputDialog("Digite o texto:");

				letra1 = JOptionPane.showInputDialog("Qual letra você deseja substituir por @?");
				texto.replace(letra1, "@");

				JOptionPane.showMessageDialog(null, texto.replace(letra1, "@"));

				break;

			case 5:

				texto = JOptionPane.showInputDialog("Digite o texto que você deseja Soletrar:");
				tamanhoFrase = Integer.parseInt(JOptionPane.showInputDialog("Qual posição você deseja cortar a frase?"));
				
						texto.substring(tamanhoFrase);

					JOptionPane.showMessageDialog(null, texto.substring(tamanhoFrase));
				

					break;

				default:
					
					JOptionPane.showMessageDialog(null,"FAVOR SELECIONAR UMA OPÇÃO VÁLIDA!");
					break;
				}		
			opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
			}
		}
	

	}
