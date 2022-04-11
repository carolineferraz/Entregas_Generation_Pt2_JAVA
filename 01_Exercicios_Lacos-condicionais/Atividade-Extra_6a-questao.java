package questoes;

import java.util.Scanner;

public class questaoExtra6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float p1,p2;
		double d;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o valor do ponto 1: ");
		p1 = leia.nextFloat();
		
		System.out.println("\nEntre com o valor do ponto 2: ");
		p2 = leia.nextFloat();
		
		d = Math.sqrt((Math.pow(p1, 2)) + (Math.pow(p2, 2)));
		
		System.out.printf("\nd = %2.2f",d);

	}

}