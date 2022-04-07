package questoes;

public class Aviao {
	
	String cor;
	String modelo;
	double velocidadeAtual;
	double velocidadeMaxima;
	
	void liga()
	{
		System.out.println("\nO avião está ligado.");
	}
	void acelera(double quantidade)
	{
		double velocidadeNova = this.velocidadeAtual+quantidade;
		this.velocidadeAtual = velocidadeNova;
	}
	int maneteEmpuxo()
	{
		if(this.velocidadeAtual<0)
		{
			return -1;
		}
		if(this.velocidadeAtual>=0 && this.velocidadeAtual<280)
		{
			return 1;
		}
		if(this.velocidadeAtual>=280 && this.velocidadeAtual<850)
		{
			return 2;
		}
		return 3;
	}

}
