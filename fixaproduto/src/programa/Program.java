package programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import back.ImportedProduct;
import back.Product;
import back.UsedProduct;

public class Program {
	
	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter the number of products: ");
		int numPro = sc.nextInt();
		
		for(int i=1; i<=numPro; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char cui = sc.next().charAt(0);
			
			if(cui == 'i') {
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Price: ");
				Double price = sc.nextDouble();
				System.out.print("Customs fee: ");
				Double custFee = sc.nextDouble();
				
				ImportedProduct Pro = new ImportedProduct(name, price, custFee);
				
				list.add(Pro);
			}
			
			else if(cui == 'c') {
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Price: ");
				Double price = sc.nextDouble();
				
				Product Pro = new Product(name, price);
				
				list.add(Pro);
			}
			
			else if(cui == 'u') {
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Price: ");
				Double price = sc.nextDouble();
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				String data = sc.next();
				
				UsedProduct Pro = new UsedProduct(name, price, sdf.parse(data));
				
				list.add(Pro);
			}
		}
		
		System.out.println();
		
		System.out.println("PRICE TAGS:");
		for(Product p : list) {
			System.out.println(p.priceTag());
		}
		
		sc.close();
	}
	
}
