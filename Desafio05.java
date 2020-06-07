package albino;

import javax.swing.JOptionPane;

public class Desafio05 {

	public static void main(String[] args) {

		int opcao;
		double num1, num2, resultado;
		String menu;

		menu = "Escolha uma opção:\n"
				+ "1 - Somar \n"
				+ "2 - Subtrair \n"
				+ "3 - Multiplicar \n"
				+ "4 - Dividir";

		opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

		switch (opcao) {

		case 1:

			num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número da SOMA: "));
			num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número da SOMA: "));

			resultado = num1 + num2;

			JOptionPane.showMessageDialog(null, "SOMA: \n"+ num1+" + "+num2+" = "+resultado);

			break;

		case 2:


			num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número da SUBTRAÇÃO: "));
			num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número da SUBTRAÇÃO: "));

			resultado = num1 - num2;

			JOptionPane.showMessageDialog(null,"SUBTRAÇÃO: \n"+ num1+" - "+num2+" = "+resultado);

			break;

		case 3:


			num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número da MULTIPLICAÇÃO: "));
			num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número da MULTIPLICAÇÃO: "));

			resultado = num1 * num2;

			JOptionPane.showMessageDialog(null,"MULTIPLICAÇÃO: \n"+ num1+" x "+num2+" = "+resultado);
			
			break;

		case 4:
			

			num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número da DIVISÃO: "));
			num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número da DIVISÃO: "));

			resultado = num1 / num2;

			JOptionPane.showMessageDialog(null,"DIVISÃO: \n"+ num1+" ÷ "+num2+" = "+resultado);

			break;


		default:
			
			JOptionPane.showMessageDialog(null,"FAVOR SELECIONAR UMA OPÇÃO VÁLIDA!");
			
			break;
		}


	}

}
