package questoes;

public class TesteAviao {
	
	public static void main (String args[])
	{
		Aviao meuAviao = new Aviao();
		meuAviao.cor = "Verde";
		meuAviao.modelo = "Airbus";
		meuAviao.velocidadeAtual = 0;
		meuAviao.velocidadeMaxima = 80;
		
		meuAviao.liga();
		
		meuAviao.acelera(600);
		System.out.println(meuAviao.velocidadeAtual);
		meuAviao.maneteEmpuxo();
	}

}
