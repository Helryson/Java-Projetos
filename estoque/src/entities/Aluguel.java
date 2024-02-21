package entities;

import java.util.Scanner;

public class Aluguel {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Pensionato[] pensionato = new Pensionato[10];
		
		System.out.println("Quantos quartos serão alugados? (Há 10 quartos disponíveis)");
		int n = sc.nextInt();
		sc.nextLine();
		
		System.out.println();
		
		for(int i=0; i<pensionato.length; i++) {
			pensionato[i] = new Pensionato(null, null, 0);
		}
		
		for(int i=0; i<n; i++){
			System.out.println("Aluguel #" + (i+1));
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Email:");
			String email = sc.nextLine();
			
			System.out.print("Quarto:");
			int quarto = sc.nextInt();
			sc.nextLine();
			
			System.out.println();
			
			if(pensionato[quarto-1].getOcupado() == false) {
				pensionato[quarto-1].setEmail(email);
				pensionato[quarto-1].setNome(nome);
				pensionato[quarto-1].setQuarto(quarto);
				pensionato[quarto-1].setOcupado(true);
			}
			else {
				System.out.println("Quarto já ocupado.");
			}
		}

		System.out.println("Quartos ocupados: ");
		
		for(int i=0; i<pensionato.length; i++) {
			if(pensionato[i].getOcupado()) {
				System.out.println(pensionato[i]);
			}
		}
		
	}
}
