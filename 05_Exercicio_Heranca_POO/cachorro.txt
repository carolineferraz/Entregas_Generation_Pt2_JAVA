
public class cachorro extends Animal{
	
	private String locomocao;
	
	public cachorro (String nome, int idade, String som, String locomocao)
	{
		super(nome,idade,som);
		this.locomocao = locomocao;
	}

	public String getLocomocao() {
		return locomocao;
	}

	public void setLocomocao(String locomocao) {
		this.locomocao = locomocao;
	}
	

}
