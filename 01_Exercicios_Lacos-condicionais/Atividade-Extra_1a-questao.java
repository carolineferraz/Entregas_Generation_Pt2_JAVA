package questoes;

import java.util.Scanner;

public class questaoExtra1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int anos,meses,dias,idadeDias;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com a quantidade de anos: ");
		anos = leia.nextInt();
		
		System.out.println("\nEntre com a quantidade de meses: ");
		meses = leia.nextInt();
		
		System.out.println("\nEntre com a quantidade de dias: ");
		dias = leia.nextInt();
		
		anos = anos * 365;
		meses = meses * 30;
		
		idadeDias = anos + meses + dias;
		
		System.out.println("\nEssa idade equivale a "+idadeDias+" dias.");
				

	}

}