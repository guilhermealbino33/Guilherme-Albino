package albino;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Desafio08 {

	public static void main(String[] args) {



		int senha1, senha2;
		DecimalFormat df = new DecimalFormat("0000");

		senha1 = Integer.parseInt(JOptionPane.showInputDialog(("Entre com uma senha numérica de 4 dígitos: ")));
		senha2 = 0;

		while (senha1 != senha2) {

			senha2++;
			
			if (senha1 != senha2) {
				System.out.println("Senhas DIFERENTES! = " + df.format(senha1) + " - " + df.format(senha2));

			}else {
				System.out.println("Senhas IGUAIS! = " + df.format(senha1) + " - " + df.format(senha2));
			}
		}
		
		JOptionPane.showMessageDialog(null, "Senha encontrada: " + senha2);
		
	}
}