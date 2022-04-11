package questoes;

import java.util.Scanner;

public class questao5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		float num,somaNum=0;
		
		do
		{
			System.out.println("\nEntre com um número: ");
			num = leia.nextFloat();
			
			somaNum += num;
		}
		
		while(num != 0);
		
		System.out.println("\nA soma total dos números foi: "+somaNum);

	}

}
