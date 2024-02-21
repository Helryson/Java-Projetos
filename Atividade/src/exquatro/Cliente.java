package exquatro;

import java.util.Scanner;

public class Cliente {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual é o preço do dolar? ");
		double dolar = sc.nextDouble();
		
		System.out.print("Quantos dolares seão comprados? ");
		double quantia = sc.nextDouble();
		
		Cambio.calculaCambio(dolar, quantia);
	}
}
