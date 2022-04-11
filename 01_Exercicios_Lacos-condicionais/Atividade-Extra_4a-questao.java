package questoes;

import java.util.Scanner;

public class questaoExtra4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a,b,c,D;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o primeiro número: ");
		a = leia.nextDouble();
		
		System.out.println("\nDigite o segundo número: ");
		b = leia.nextDouble();
		
		System.out.println("\nDdigite o terceiro número: ");
		c = leia.nextDouble();
		
		D = (Math.pow((a+b),2) + Math.pow((b+c), 2)) / 2;
		
		System.out.println("\nO valor de D é: "+D);
				

	}

}