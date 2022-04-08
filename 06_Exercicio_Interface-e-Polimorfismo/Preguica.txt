
public class Preguica extends Animal{
	
	public Preguica()
	{
		super("Tipo animal: Preguica");
	}
	
	
	@Override
	public void nome(String nomeAnimal)
	{
		System.out.println("\nNome da preguiça: "+nomeAnimal);
		
	}
	
	@Override
	public void idade(int idadeAnimal)
	{
		System.out.println("\nIdade: "+idadeAnimal);
	}
	
	@Override
	public void som(String somAnimal)
	{
		System.out.println("\nsom: "+somAnimal);
	}
	
	public void subirArvore()
	{
		System.out.println("\nUma das características da preguiça é subir em árvores.");
	}

}
