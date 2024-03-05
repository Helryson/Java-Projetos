package program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import entities.Estoque;
import entities.Produto;

public class Programa {
	
	public static void main(String[] args) throws ParseException {
	
		SimpleDateFormat sdf = new SimpleDateFormat("MM/yyyy");
		Scanner sc = new Scanner(System.in);
		Estoque estoque = new Estoque();
		int op, id = 0;
		
		
		try{
		
		
			do {
				System.out.println("1 - Cadastrar produtos\n2 - Verificar estoque\n3 - Finalizar programa");
				op = sc.nextInt();
				switch(op) {
				case 1: 
					id += 1;
					System.out.print("Nome: ");
					sc.nextLine();
					String nome = sc.nextLine();
					
					System.out.print("Preço: ");
					Double preco = sc.nextDouble();
					
					System.out.print("Quantidade em estoque: ");
					int qntEstoque = sc.nextInt();
					
					System.out.print("Data de vencimento(MM/YYYY): ");
					Date dataVenc = sdf.parse(sc.next());
					
					System.out.println();
					
					Produto produto = new Produto(id, nome, preco, qntEstoque, dataVenc);
					estoque.addProduto(produto);
					break;
				
					case 2:
						estoque.imprimeLista();
						break;
						
					default:
			        System.out.println("Número inválido\n");
			        break;
				}
				
			}while(op != 3);
		}
		catch(ParseException e) {
			System.out.println(e.getMessage());
		}
		catch(IllegalArgumentException f) {
			System.out.println("Estoque esgotado");
		}
		catch(InputMismatchException g) {
			System.out.println("Caractere inválido");
		}
		finally {
			sc.close();
		}
		
		//adicionar editção de produtos com alteraçao de nome e preço com metodos do objeto
	}
}