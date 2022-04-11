package Questoes;

import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int[] numeros = new int [6];
		int[] pares = new int [6];
		int[] impares = new int [6];
		int x=0,somaNumeros=0,qtdImpar=0;
		
		for(x=0;x<6;x++)
		{
		
			System.out.printf("\nEntre com o inteiro da posição %d: ",x+1);
			numeros[x] = leia.nextInt();
		
			if(numeros[x] % 2 == 0)
			{
				somaNumeros += numeros[x];
				pares[x] = numeros[x];
			}
			else
			{
				qtdImpar++;
				impares[x] = numeros[x];
			}
		
		}
		
		System.out.println("\nOs números parers digitados foram: "+pares[0]+", "+pares[1]+", "+pares[2]+", "+pares[3]+", "+pares[4]+", "+pares[5]);
		System.out.println("\nA soma dos números pares digitados é: "+somaNumeros);
		System.out.println("\nOs números ímparers digitados foram: "+impares[0]+", "+impares[1]+", "+impares[2]+", "+impares[3]+", "+impares[4]+", "+impares[5]);
		System.out.println("\nA quntidade de números ímpares digitados foi: "+qtdImpar);
		

	}

}