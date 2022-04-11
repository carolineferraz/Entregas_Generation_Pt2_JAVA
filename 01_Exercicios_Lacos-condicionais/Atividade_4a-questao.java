package questoes;

import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double num, raizNum, quadradoNum;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre aqui com o número desejado: ");
		num = leia.nextDouble();
		
		if(num % 2 == 0)
		{
			raizNum = Math.sqrt(num);
			System.out.println("\nEste número é par.");
			System.out.printf("\nA raiz quadrada deste número é %2.2f",raizNum);	
		}
		else
		{
			System.out.println("\nEste número é ímpar.");
			quadradoNum = Math.pow(num, 2);
			System.out.println("\nEste número elevado ao quadrado é: "+quadradoNum);
		}
		
		

	}

}
