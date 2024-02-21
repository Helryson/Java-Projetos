package extres;

import java.util.Scanner;

public class VerificaNegativo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar?");
		int n = sc.nextInt();
		int[] numeros = new int[n];
		
		for(int i=0; i<numeros.length; i++) {
			System.out.print("Digite um número: ");
			numeros[i] = sc.nextInt();
		}
		
		System.out.println("NÚMEROS NEGATIVOS:");
		
		for(int i=0; i<numeros.length; i++) {
			if(numeros[i] < 0) {
				System.out.println(numeros[i]);
			}
		}
	
	}
	
}
