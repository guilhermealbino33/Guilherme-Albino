package albino;

import java.util.Locale;
import java.util.Scanner;

public class Desafio01 {
  
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);;
		
		Scanner sc = new Scanner(System.in);
		
		String nome, cidadeDestino = "";
		double consumoMedio, distancia, consumoFinal;

		System.out.println("Digite o nome do seu carro: \n");
		nome = sc.next();
		System.out.println("Carro: "+nome+"\n");
		
		System.out.println("Digite o consumo do seu carro: \n");
		consumoMedio = sc.nextDouble();
		System.out.println("Consumo do seu carro: "+consumoMedio+" km/l \n");
		
		System.out.println("Digite a cidade destino: \n");
		cidadeDestino = sc.next();
		System.out.println("Digite o seu destino: "+cidadeDestino+"\n");

		System.out.println("Digite a distância desta cidade: \n");
		distancia = sc.nextDouble();
		System.out.println("Digite a distância até esta cidade: "+distancia+"\n");

		consumoFinal = distancia/consumoMedio;
		System.out.printf("O seu consumo total de combustível foi de: %.2f litros",consumoFinal);
				
		sc.close();
	}
	
}
