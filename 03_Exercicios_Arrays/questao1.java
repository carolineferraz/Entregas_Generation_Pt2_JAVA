package Questoes;

import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int[] A = {1, 0, 5, -2, -5, 7};
		int soma;
		
		
		soma = A[0] + A[1] + A[5];
		
		System.out.println("Letra A: Os valores do vetor A são: "+A[0]+", "+A[1]+", "+A[2]+", "+A[3]+", "+A[4]+", "+A[5]);
		
		System.out.println("\nLetra B: O resultado da soma é: "+soma);
		
		A[3] = 100;
		
		System.out.println("\nLetra C: Os valores do vetor A agora são: "+A[0]+", "+A[1]+", "+A[2]+", "+A[3]+", "+A[4]+", "+A[5]);
		
		System.out.println("\nLetra D: Os valores do vetor A um em cada linha: \n"+A[0]+",\n"+A[1]+",\n"+A[2]+",\n"+A[3]+",\n"+A[4]+",\n"+A[5]);

	}

}