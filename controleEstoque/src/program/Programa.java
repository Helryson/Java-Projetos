package program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Estoque;
import entities.Produto;

public class Programa {
	
	public static void main(String[] args) {
	
		SimpleDateFormat sdf = new SimpleDateFormat("MM/yyyy");
		Scanner sc = new Scanner(System.in);
		Estoque estoque = new Estoque();
		int op;
		
		try{
			do {
				System.out.println("1 - Cadastrar produtos\n2 - Verificar estoque\n3 - Finalizar programa");
				op = sc.nextInt();
				switch(op) {
				case 1: 
					System.out.print("Nome: ");
					String nome = sc.nextLine();
					System.out.print("Preço: ");
					Double preco = sc.nextDouble();
					System.out.print("Quantidade em estoque: ");
					int qntEstoque = sc.nextInt();
					System.out.print("Data de vencimento(MM/YYYY): ");
					Date dataVenc = sdf.parse(sc.next());
					
					Produto produto = new Produto(nome, preco, qntEstoque, dataVenc);
					estoque.addProduto(produto);
				}
				
			}while(op != 3);
		}
		catch(ParseException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}
}