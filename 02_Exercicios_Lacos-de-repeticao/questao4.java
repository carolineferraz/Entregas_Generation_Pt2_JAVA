package questoes;

import java.util.Scanner;

public class questao4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int x=1,op1,op2,idade,calm=0,femNerv=0,mascAgres=0,outroCalm=0,nerv40=0,calm18=0;
		
		while (x<=4)
		{
			System.out.println("\nDigite a idade da pessoa "+x+": ");
			idade = leia.nextInt();
		
			System.out.println("\nDigite o sexo da pessoa "+x+": ");
			System.out.println("\nOp.1: Feminino.");
			System.out.println("\nOp.2: Masculino.");
			System.out.println("\nOp.3: Outro.");
			op1 = leia.nextInt();
			
			while(op1<0 || op1>3)
			{
				System.out.println("\nDigite o sexo da pessoa "+x+": ");
				op1 = leia.nextInt();
			}
			
			switch(op1)
			{
				case 1:
					
				break;
				case 2:
					
				break;
				case 3:
					
				break;	
			}
			
		
			System.out.println("\nDigite o temperamento predominante da pessoa "+x+": ");
			System.out.println("\nOp.1: Pessoa calma.");
			System.out.println("\nOp.2: Pessoa nervosa.");
			System.out.println("\nOp.3: Pessoa agressiva.");
			op2 = leia.nextInt();
			
			while(op2<0 || op2>3)
			{
				System.out.println("\nDigite o temperamento predominante da pessoa "+x+": ");
				op2 = leia.nextInt();
			}
			
			switch(op2)
			{
				case 1:
					calm++;
				break;
				case 2:
					
				break;
				case 3:
					
				break;
			}
			
			if (op1==1 && op2==2)
			{
				femNerv++;
			}
			else if (op1==2 && op2==3)
			{
				mascAgres++;
			}
			else if (op1==3 && op2==1)
			{
				outroCalm++;
			}
			if (idade>40 && op2==2)
			{
				nerv40++;
			}
			else if (idade<18 && op2==1)
			{
				calm18++;
			}
			
			
			x++;
		}
		
		System.out.println("\nA quantidade de pessoas calmas foi: "+calm);
		System.out.println("\nA quantidade de mulheres nervosas foi: "+femNerv);
		System.out.println("\nA quantidade de homens agressivos foi: "+mascAgres);
		System.out.println("\nA quantidade de outros calmos foi: "+outroCalm);
		System.out.println("\nA quantidade de pessoas nervosas com mais de 40 anos foi: "+nerv40);
		System.out.println("\nA quantidade de pessoas calmas com menos de 18 anos foi: "+calm18);



	}

}
