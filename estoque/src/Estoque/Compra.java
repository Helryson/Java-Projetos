package Estoque;
import Estoque.Produto;
import java.util.Scanner;

public class Compra {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		Produto item = new Produto();
		
		System.out.println("Insira os dados do produto:");
		System.out.print("Nome: ");
		item.nome = sc.nextLine();
		System.out.print("Preço: ");
		item.preco = sc.nextDouble();
		System.out.print("Quantidade em estoque: ");
		item.quantidade = sc.nextInt();
		
		System.out.println("Dados do produto: " + item);
		
		System.out.print("Insira o número de produtos para ser adicionado no estoque: ");
		int x = sc.nextInt();
		item.addProdutos(x);
		System.out.println("Dados atualizados: " + item);
		
		System.out.print("Insira o número de produtos para ser removido do estoque: ");
		int y = sc.nextInt();
		item.removeProdutos(y);
		System.out.println("Dados atualizados: " + item);
		
		sc.close();
		
	}
}
