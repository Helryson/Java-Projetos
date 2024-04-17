package program;

import java.util.Scanner;

import entities.Account;
import exception.DomainException;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			sc.next();
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			Double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			Double wlimit = sc.nextDouble();
			
			System.out.println();
			
			Account conta = new Account(number, holder, balance, wlimit);
			
			System.out.print("Enter amount for withdraw: ");
			Double withdraw = sc.nextDouble();
			conta.withdraw(withdraw);
			
			System.out.println(conta.toString());
			
		}
		catch(DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Unexpected error");
		}

		sc.close();
		
	}
	
}
