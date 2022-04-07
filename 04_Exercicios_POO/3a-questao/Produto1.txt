package questoes;

public class produto1 {
	
	public static void main (String args [])
	{
		ProdutoEletronico produto1 = new ProdutoEletronico();
		produto1.setTipo("notebook");
		produto1.setPreco(5000);
		
		System.out.println(produto1.getTipo());
		System.out.println(produto1.getPreco());
	}

}


