package albino;

import javax.swing.JOptionPane;

public class Desafio02 {

	public static void main(String[] args) {

		String nome, genero, email;
		double altura, peso;
		int idade;

		nome = JOptionPane.showInputDialog("Digite seu nome: ");
		genero = JOptionPane.showInputDialog("Gênero: ");
		email = JOptionPane.showInputDialog("Digite seu e-mail: ");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: "));
		peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso: "));

		JOptionPane.showMessageDialog(null, "Dados da pessoa:\n"
				+ "Nome: "+nome+"\n"
				+ "Gênero: "+genero+"\n"
				+ "Idade: "+idade+"\n"
				+ "Altura: "+altura+"\n"
				+ "Peso: "+peso+"\n"
				+ "E-mail: "+email);

		//passou dois anos

		idade = idade +2;
		altura = altura - 1;
		peso = peso + 4.5;
		email = JOptionPane.showInputDialog("Por favor, confirme seu e-mail: ");
		
		JOptionPane.showMessageDialog(null, "Dados da pessoa após dois anos:\n"
				+ "Nome: "+nome+"\n"
				+ "Gênero: "+genero+"\n"
				+ "Idade: "+idade+"\n"
				+ "Altura: "+altura+"\n"
				+ "Peso: "+peso+"\n"
				+ "E-mail: "+email);
		
	}

}
