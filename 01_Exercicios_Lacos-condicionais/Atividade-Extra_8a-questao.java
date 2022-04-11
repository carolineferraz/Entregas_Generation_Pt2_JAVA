package questoes;

import java.util.Scanner;

public class questaoExtra8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double custoFabrica,percImpostos,percDistribuidor,valorFinal;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite qual foi o custo de fábrica: ");
		custoFabrica = leia.nextFloat();
		
		percDistribuidor = 0.28 * custoFabrica;
		
		percImpostos = 0.45 * custoFabrica;
		
		valorFinal = custoFabrica + percDistribuidor + percImpostos;
		
		System.out.printf("\nO custo final do produto ao consumidor será: %2.2f",valorFinal);
		
	}

}