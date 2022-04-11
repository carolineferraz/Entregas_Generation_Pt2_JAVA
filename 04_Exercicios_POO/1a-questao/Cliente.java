package questoes;

public class Cliente {
	
	private String nome;
	private String cpf;
	private String data;
	
	public Cliente (String nomeCompleto, String numCpf, String dataNasc)
	{
		nome = nomeCompleto;
		cpf = numCpf;
		data = dataNasc;
	}
	
	public String getDadosCompletos()
	{
		String dadosCompletos = nome+", "+cpf+", "+data;
		return dadosCompletos;
	}

}
