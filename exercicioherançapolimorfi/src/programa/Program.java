package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import back.Employee;
import back.OutsourcedEmployee;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int nEmp = sc.nextInt();
		
		for(int i=0; i<nEmp; i++) {
			System.out.println("Employee #" + (i+1) + " data:");
			System.out.print("Outsourced? ");
			char outD = sc.next().charAt(0);
			if(outD == 'y') {
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				
				System.out.print("Hours: ");
				Integer hours = sc.nextInt();
				
				System.out.print("Value per hour: ");
				Double vph = sc.nextDouble();
				
				System.out.print("Additional charge: ");
				Double adCharge = sc.nextDouble();
				
				OutsourcedEmployee outEmp = new OutsourcedEmployee(name, hours, vph, adCharge);
				
				list.add(outEmp);
			}
			
			else if(outD == 'n') {
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				
				System.out.print("Hours: ");
				Integer hours = sc.nextInt();
				
				System.out.print("Value per hour: ");
				Double vph = sc.nextDouble();
				
				Employee outEmp = new Employee(name, hours, vph);
				
				list.add(outEmp);
			}
		}
		
		System.out.println();
		
		System.out.println("PAYMENTS: ");
		for(Employee outE : list) {
			System.out.println(outE.toString());
		}
		
		sc.close();
		
	}
	
}
