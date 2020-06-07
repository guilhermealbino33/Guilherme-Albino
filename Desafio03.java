package albino;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class Desafio03 {

	public static void main(String[] args) {

		String nome;
		double nota1, nota2, nota3, media, frequencia;
		int aula1, aula2, aula3, aula4;

		nome = JOptionPane.showInputDialog("Nome do aluno: ");


		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Nota 1: "));
		while (nota1 > 10 || nota1 < 0) {

			JOptionPane.showMessageDialog(null, "A nota não pode ser superior a 10 ou inferior a 0!");

			nota1 = Double.parseDouble(JOptionPane.showInputDialog("Nota 1: "));

		}


		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Nota 2: "));
		while (nota2 > 10 || nota2 < 0) {

			JOptionPane.showMessageDialog(null, "A nota não pode ser superior a 10 ou inferior a 0!");
			nota2 = Double.parseDouble(JOptionPane.showInputDialog("Nota 2: "));
		}

		nota3 = Double.parseDouble(JOptionPane.showInputDialog("Nota 3: "));
		while (nota3 > 10 || nota3 < 0) {

			JOptionPane.showMessageDialog(null, "A nota não pode ser superior a 10 ou inferior a 0!");
			nota3 = Double.parseDouble(JOptionPane.showInputDialog("Nota 3: "));
		}

		aula1 = JOptionPane.showConfirmDialog(null, "Aluno compareceu a aula 1?");

		if (aula1 == JOptionPane.YES_OPTION) {

			aula1 = 25;

		}else {aula1 = 0;
		}

		aula2 = JOptionPane.showConfirmDialog(null, "Aluno compareceu a aula 2?");

		if (aula2 == JOptionPane.YES_OPTION) {

			aula2 = 25;

		}else {aula2 = 0;
		}

		aula3 = JOptionPane.showConfirmDialog(null, "Aluno compareceu a aula 3?");

		if (aula3 == JOptionPane.YES_OPTION) {

			aula3 = 25;

		}else {aula3 = 0;
		}

		aula4 = JOptionPane.showConfirmDialog(null, "Aluno compareceu a aula 4?");

		if (aula4 == JOptionPane.YES_OPTION) {

			aula4 = 25;

		}else {aula4 = 0;
		}

		frequencia = aula1+aula2+aula3+aula4;
		media = (nota1+nota2+nota3)/3;

		DecimalFormat df = new DecimalFormat("##.##");  
		if (media >= 7 && frequencia >= 75)  {

			JOptionPane.showMessageDialog(null, "Aluno: "+nome+", APROVADO! \n"
					+"Média: "+df.format(media)+"\n"
					+"Frequência: "+frequencia+"%");

		}if (media >= 7 && frequencia < 75) {

			JOptionPane.showMessageDialog(null, "Aluno: "+nome+", REPROVADO! \n"
					+"Média: "+df.format(media)+"\n"
					+"Frequência: "+frequencia+"%\n"
					+"Motivo da reprovação: FREQUENCIA INFERIOR A 75%");

		}if (media < 7 && frequencia >= 75) {
			JOptionPane.showMessageDialog(null, "Aluno: "+nome+", REPROVADO! \n"
					+"Média: "+df.format(media)+"\n"
					+"Frequência: "+frequencia+"%\n"
					+"Motivo da reprovação: MÉDIA INFERIOR A 7,0");
		}if (media <= 7 && frequencia <= 75)  {
			JOptionPane.showMessageDialog(null, "Aluno: "+nome+", REPROVADO! \n"
					+"Média: "+df.format(media)+"\n"
					+"Frequência: "+frequencia+"%\n"
					+"Motivo da reprovação:\n"
					+ "FREQUENCIA INFERIOR A 75%\n"
					+ "MÉDIA INFERIOR A 7,0");
		}
	}
}

