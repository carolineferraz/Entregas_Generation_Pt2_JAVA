package questoes;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite aqui sua idade: ");
		idade = leia.nextInt();
		
		if(idade>=10 && idade<=14)
		{
			System.out.println("\nCategoria: Infantil");
		}
		else if(idade>=15 && idade<=17)
		{
			System.out.println("\nCategoria: Juvenil");
		}
		else if(idade>=15 && idade<=25)
		{
			System.out.println("\nCategoria: Adulto");
		}
		else
		{
			System.out.println("\nCategoria inválida.");
		}
		
		

	}

}
