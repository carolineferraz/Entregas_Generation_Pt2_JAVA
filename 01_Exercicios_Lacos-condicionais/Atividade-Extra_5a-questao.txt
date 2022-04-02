package questoes;

import java.util.Scanner;

public class questaoExtra5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float n1,n2,n3,media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o valor da nota 1: ");
		n1 = leia.nextFloat();
		
		System.out.println("\nDigite o valor da nota 2: ");
		n2 = leia.nextFloat();
		
		System.out.println("\nDigite o valor da nota 3: ");
		n3 = leia.nextFloat();
		
		media = (n1*2 + n2*3 + n3*5) / 3;
		
		System.out.printf("\nO valor da media foi: %2.2f",media);
				
		

	}

}
