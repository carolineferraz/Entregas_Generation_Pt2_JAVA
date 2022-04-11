package questoes;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, num2, num3;
		
		Scanner leia = new Scanner(System.in);

		System.out.println("\nDigite o primeiro número inteiro: ");
		num1 = leia.nextInt();
		
		System.out.println("\nDigite o segundo número inteiro: ");
		num2 = leia.nextInt();
		
		System.out.println("\nDigite o terceiro número inteiro: ");
		num3 = leia.nextInt();
		
		if(num1>num2 && num1>num3)
		{
			System.out.println("\nO maior número é: "+num1);
		}
		else if(num2>num1 && num2>num3)
		{
			System.out.println("\nO maior número é: "+num2);
		}
		else if(num3>num1 && num3>num2)
		{
			System.out.println("\nO maior número é: "+num3);
		}
		else
		{
			System.out.println("\nOperação inválida.");
		}
			
		
	}

}
