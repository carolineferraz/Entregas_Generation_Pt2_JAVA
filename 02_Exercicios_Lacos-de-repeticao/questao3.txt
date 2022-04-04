package questoes;

import java.util.Scanner;

public class questao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int idade=0,qtd21=0,qtd50=0;
		
		while(idade != -99)
		{
			System.out.println("\nDigite a idade: ");
			idade = leia.nextInt();
			
			if(idade>=0 && idade<21)
			{
				System.out.println("\nIdade computada: "+idade);
				qtd21++;
			}
			else if(idade>50)
			{
				System.out.println("\nIdade computada: "+idade);
				qtd50++;
			}
			else if(idade<0)
			{
				System.out.println("\nIdade inválida.");
			}
				
		}
		
		System.out.println("\nQuantidade de pessoas com menos de 21 anos: "+qtd21);
		System.out.println("\nQuantidade de pessoas com mais de 50 anos: "+qtd50);

	}

}
