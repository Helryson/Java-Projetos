package program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Programa {
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Order order = new Order();
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.nextLine());
		
		Client cliente = new Client(name, email, birthDate);
		
		System.out.println();
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus oStatus = OrderStatus.valueOf(sc.next().toUpperCase());
		
		Order ordem = new Order(new Date(), oStatus, cliente);
		
		System.out.print("How many items to this order? ");
		int itemsQnt = sc.nextInt();
		System.out.println();
		for(int i=1; i<=itemsQnt; i++) {
			System.out.println("Enter #" + i + " item data: ");
			System.out.print("Product name: ");
			sc.nextLine();
			String pName = sc.nextLine();
			System.out.print("Product price: ");
			double pPrice = sc.nextDouble();
			
			Product produto = new Product(pName, pPrice);
			
			System.out.print("Quantity: ");
			int pQnt = sc.nextInt();
			
			OrderItem ordemPedido = new OrderItem(produto, pQnt, pPrice);
			
			ordem.addItem(ordemPedido);
		}
		
		System.out.println();
		System.out.println(ordem.toString());
		
		sc.close();
		
	}
}
