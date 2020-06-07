package albino;

import javax.swing.JOptionPane;

public class Desafio04 {

	public static void main(String[] args) {

		String nome;
		double altura, peso, imc;

		nome = JOptionPane.showInputDialog("Digite o nome da pessoa para o cálculo do IMC: ");
		altura = Double.parseDouble(JOptionPane.showInputDialog("Altura: "));
		peso  = Double.parseDouble(JOptionPane.showInputDialog("Peso: "));

		imc = (altura*altura)/peso;

		if (imc >= 0.0 && imc < 18.5) {
			JOptionPane.showMessageDialog(null, nome+ ", está abaixo do peso ideal! \n" 
					+peso+ "KG");
			// Abaixo 18,5 
		}
		else if (imc >= 18.5 && imc <= 24.9) {
			JOptionPane.showMessageDialog(null,"Parabéns "+nome+", está no seu peso ideal! \n" 
					+peso+ "KG");
		}
		else if (imc >= 25.0 && imc <= 29.9) {
			JOptionPane.showMessageDialog(null,nome+ ", está acima do seu peso ideal (sobrepeso)!");
// Entre 25,0 e 29,9 
		}
		else if (imc >= 30.0 && imc <= 34.9) {
			JOptionPane.showMessageDialog(null,"Obesidade grau I");
// Entre 30,0 e 34,9
		}
		else if (imc >= 35.0 && imc <= 39.9) {
			JOptionPane.showMessageDialog(null,"Obesidade grau II");
// Entre 35,0 e 39,9 
		}
		else if (imc >= 40.0) {
			JOptionPane.showMessageDialog(null,"Obesidade grau III");
// 40,0 e acima 
		}
		else {
			JOptionPane.showMessageDialog(null,"Favor verificar os dados digitados!");
		}

	}

}


