package questoes;

import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int x=1,num,qtdPar=0,qtdImpar=0;
		
		for(x=1;x<11;x++)
		{
			System.out.println("\nEntre com um número inteiro: ");
			num = leia.nextInt();
			
			if(num % 2 == 0)
			{
				qtdPar++;
			}
			else
			{
				qtdImpar++;
			}
		}
		
		System.out.println("\nQuantidade de números pares: "+qtdPar);
		System.out.println("\nQuantidade de números ímpares: "+qtdImpar);

	}

}
