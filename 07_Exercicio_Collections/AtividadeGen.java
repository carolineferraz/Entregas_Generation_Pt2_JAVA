package AtividadeGen;

import java.util.ArrayList;
import java.util.Scanner;

public class AtividadeGen {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		int op;
				
		ArrayList<String> estoque = new ArrayList();
				
		do
		{
			System.out.print("\nOpção 1: Armazenar um produto ao estoque;");
			System.out.print("\nOpção 2: Remover um produto do estoque;");
			System.out.print("\nOpção 3: Atualizar um produto do estoque;");
			System.out.print("\nOpção 4: Mostrar todos os produtos do estoque;");
			System.out.print("\nOpção 0: Encerrar o programa.");
			System.out.print("\n\nDigite a opção que você deseja: ");
			
			op= leia.nextInt();
					
			switch (op) 
				{
				case 1:
					leia.nextLine(); 
					System.out.println("\nDigite o nome do produto que você deseja adicionar ao estoque: ");
					String novoItem = leia.nextLine();
					estoque.add(novoItem);
				break;
				case 2:
					leia.nextLine();
					System.out.println("\nDigite o nome do produto que você deseja remover do estoque: ");
					String removerItem = leia.nextLine();
							
					if (estoque.contains(removerItem))
					{
						estoque.remove(removerItem);
						System.out.println("\nProduto removido do estoque.");
					} 
					else 
					{
						System.out.println("\nProduto não existe no estoque.");
					}
							
				break;
				case 3:
					leia.nextLine();
					System.out.println("\nDigite o nome do produto que você deseja substituir no estoque: ");
					String item = leia.nextLine();
					System.out.println("\nDigite o produto que entrará no lugar de "+item+": ");
					String atualizaItem = leia.nextLine();
							
					if (estoque.contains(item))
					{
						estoque.remove(item);
						estoque.add(atualizaItem);
						System.out.println("\nProduto Atualizado com sucesso.");
					} 
					
					else 
					{
						System.out.println("\nProduto não existente ou não cadastrado.");
					}
							
				break;
				case 4:
					System.out.println("\nProdutos que estão em estoque: ");
					System.out.println(estoque);
				break;		
				default:
					System.out.println("Opção inválida. Digite uma opção novamente:");
					op= leia.nextInt();
				}
		} 
		while(op !=0);
		leia.close();
	}
}