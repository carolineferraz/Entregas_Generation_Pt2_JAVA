package questoes;

import java.util.Scanner;

public class questaoExtra3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tempoSeg,resto,horas,min,seg;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o tempo total em segundos: ");
		tempoSeg = leia.nextInt();
		
		horas = tempoSeg / 3600;
		resto = tempoSeg % 3600;
		min = resto / 60;
		seg = resto % 60;
		
		System.out.println("\nEsse tempo representa "+horas+" horas, "+min+" minutos e "+seg+" segundos.");
				

	}

}