package Questoes;

import java.util.Scanner;

public class questao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float[][] numeros = new float[3][3];
		int L=0,C=0,qtd10=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(L=0;L<3;L++)
		{
			for(C=0;C<3;C++)
			{
				System.out.println("\nEntre com o valor a linha "+L+" coluna "+C+": ");
				numeros[L][C] = leia.nextInt();
				
				if(numeros[L][C] > 10)
				{
					qtd10++;
				}
			}
		}
		
		System.out.println("\nEssa matriz possui "+qtd10+" valores maiores que 10.");
		

	}

}