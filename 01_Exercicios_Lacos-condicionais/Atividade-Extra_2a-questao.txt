package questoes;

import java.util.Scanner;

public class questaoExtra2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int anos,meses,dias,resto,idadeDias;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o valor da idade em dias: ");
		idadeDias = leia.nextInt();
		
		anos = idadeDias / 365;
		resto = idadeDias % 365;
		meses = resto / 30;
		dias = resto % 30;
		
		System.out.println("\nA idade é de "+anos+" ano(s), "+meses+" mês(meses) e "+dias+" dia(s).");
		
		
	}

}