package program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import back.Reserva;

public class Programa {
	public static void main(String[] args) throws ParseException{
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.print("Room number: ");
			int roomNum = sc.nextInt();
			System.out.print("Check-in date (dd/MM/yyyy): ");
			Date checkin = sdf.parse(sc.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			Date checkout = sdf.parse(sc.next());
			
			Reserva reserva = new Reserva(roomNum, checkin, checkout);
			
			System.out.println(reserva.toString());
			System.out.println();
			
			System.out.println("Enter data to update the reservation:");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkin = sdf.parse(sc.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkout = sdf.parse(sc.next());
			
			reserva.updateDates(checkin, checkout);
			
			System.out.println(reserva.toString());
			System.out.println();
			
			System.out.print("Room number: ");
			int roomNum1 = sc.nextInt();
			System.out.print("Check-in date (dd/MM/yyyy): ");
			Date checkin1 = sdf.parse(sc.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			Date checkout1 = sdf.parse(sc.next());
			
			Reserva reserva1 = new Reserva(roomNum1, checkin1, checkout1);
		}
		catch(ParseException e) {
			
		}
	}
}
