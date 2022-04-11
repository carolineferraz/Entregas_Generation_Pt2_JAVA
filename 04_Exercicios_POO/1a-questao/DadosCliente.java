package questoes;

public class DadosCliente {
	
	public static void main (String args[])
	{
		Cliente dadosCliente = new Cliente("João Brasil", "111.111.111.-11", "01/01/1990");
		System.out.println(dadosCliente.getDadosCompletos());
	}

}
