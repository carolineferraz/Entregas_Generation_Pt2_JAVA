package Questoes;

import java.util.Scanner;

public class questao4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		float[][] numMatriz1 = new float[2][2];
		float[][] numMatriz2 = new float[2][2];
		float[][] numMatrizR = new float[2][2];
		int L,C,op;
		final int pi = 3;
		
		for(L=0;L<2;L++)
		{
			for(C=0;C<2;C++)
			{
				System.out.println("\nEntre com o número da linha "+L+" coluna "+C+" da Primeira Matriz: ");
				numMatriz1[L][C] = leia.nextFloat();
			}
		}
		
		L=0;C=0;
		
		for(L=0;L<2;L++)
		{
			for(C=0;C<2;C++)
			{
				System.out.println("\nEntre com o número da linha "+L+" coluna "+C+" da Segunda Matriz: ");
				numMatriz2[L][C] = leia.nextFloat();
			}
		}
		
		L=0;C=0;
		
		System.out.println("\nDigite uma opção: ");
		System.out.println("\nOp. 1: Somar as duas matrizes; ");
		System.out.println("\nOp. 2: Subtrair a Segunda Matriz pela Primeira Matriz; ");
		System.out.println("\nOp. 3: Adicionar uma constante às duas matrizes; ");
		System.out.println("\nOp. 4: Imprimir as duas matrizes. ");
		op = leia.nextInt();
		
		while(op<1 || op>4)
		{
			System.out.println("\nVocê não digitou um valor válido. Digite uma opção novamente: ");
			op = leia.nextInt();
		}
		
		switch(op)
		{
		case 1:
			
			L=0;C=0;
			
			for(L=0;L<2;L++)
			{
				for(C=0;C<2;C++)
				{
					numMatrizR[L][C] = numMatriz1[L][C] + numMatriz2[L][C];
					System.out.println("\n["+L+"]["+C+"] = "+numMatrizR[L][C]);
				}
			}
			
		break;
		case 2:
			
			L=0;C=0;
			
			for(L=0;L<2;L++)
			{
				for(C=0;C<2;C++)
				{
					numMatrizR[L][C] = numMatriz2[L][C] - numMatriz1[L][C];
					System.out.println("\n["+L+"]["+C+"] = "+numMatrizR[L][C]);
				}
			}
				
		break;
		case 3:
			
			L=0;C=0;
			System.out.println("\nPrimeira Matriz: ");
			
			for(L=0;L<2;L++)
			{
				for(C=0;C<2;C++)
				{
					numMatrizR[L][C] = numMatriz1[L][C] + pi;
					System.out.println("\n["+L+"]["+C+"] = "+numMatrizR[L][C]);
				}
			}
				
			L=0;C=0;
			System.out.println("\nSegunda Matriz: ");
			
			for(L=0;L<2;L++)
			{
				for(C=0;C<2;C++)
				{
					numMatrizR[L][C] = numMatriz2[L][C] + pi;
					System.out.println("\n["+L+"]["+C+"] = "+numMatrizR[L][C]);
				}
			}
				
		break;
		case 4:
			
			L=0;C=0;
			System.out.println("\nPrimeira Matriz: ");
			
			for(L=0;L<2;L++)
			{
				for(C=0;C<2;C++)
				{
					System.out.println("\n["+L+"]["+C+"] = "+numMatriz1[L][C]);
				}
			}
				
			L=0;C=0;
			System.out.println("\nSegunda Matriz: ");
			
			for(L=0;L<2;L++)
			{
				for(C=0;C<2;C++)
				{
					System.out.println("\n["+L+"]["+C+"] = "+numMatriz2[L][C]);
				}
			}
				
		break;
		
			
			
		}
		
		

	}

}
