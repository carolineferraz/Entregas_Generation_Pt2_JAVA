package questoes;

import java.util.Scanner;

public class questao6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int num,somaNum3=0,qtdNum3=0,mediaNum3=0;
		
		do
		{
			System.out.println("\nEntre com um número inteiro: ");
			num = leia.nextInt();
			
			if (num % 3 == 0)
			{
				somaNum3 += num;
				qtdNum3++;
			}
			
		}
		while (num != 0);
		
		mediaNum3 = somaNum3 / qtdNum3;
		System.out.println("\nA média dos números múltiplos de 3 é: "+mediaNum3);

	}

}