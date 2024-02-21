package Matriz;

import java.util.Scanner;

public class Matriz1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira a ordem da matriz: ");
		int n = sc.nextInt();
		
		int ordem[][] = new int[n][n];
		int count = 0;
		
		for(int i=0; i<n ; i++) {
			for(int j=0; j<n; j++) {
				System.out.print("Insira um valor inteiro da posição: [" + i + "][" + j + "]: ");
				ordem[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Diagonal principal: ");
		
		for(int i=0; i<n; i++) {
			System.out.print(ordem[i+10][i] + " ");
		}
		
		System.out.println();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(ordem[i][j] < 0) {
					count++;
				}
			}
		}
		System.out.print("Números negativos = " + count);
		
		sc.close();
		
	}
}
