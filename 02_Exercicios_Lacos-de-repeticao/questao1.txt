package questoes;

import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int x=1000;
		
		for(x=1000;x<2000;x++)
		{
			if(x % 11 == 5)
			{
				System.out.println(x);
			}
		}

	}

}
