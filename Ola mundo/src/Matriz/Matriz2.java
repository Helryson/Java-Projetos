package Matriz;

import java.util.Scanner;

public class Matriz2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int ordem[][] = new int[n][m];
		
		for(int i=0; i<n ; i++) {
			for(int j=0; j<m; j++) {
				ordem[i][j] = sc.nextInt();
			}
		}
		
		int numerop = sc.nextInt();
		
		calculaBorda(ordem, numerop, n, m);
		
		sc.close();
		
	}
	
	public static void calculaBorda(int[][] matriz, int posnum, int n, int m) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(matriz[n][m] == posnum) {
					System.out.println("Position " + n + "," + m + ":");
					if(j>0) {
						System.out.println("Left: " + matriz[i][j-1]);
					}
					if(j<m-1) {
						System.out.println("Right: " + matriz[i][j+1]);
					}
					if(i>0) {
						System.out.println("Up: " + matriz[i-1][j]);
					}
					if(i<n-1) {
						System.out.println("Down: " + matriz[i+1][j]);
					}
				}
			}
		}
	}
}
