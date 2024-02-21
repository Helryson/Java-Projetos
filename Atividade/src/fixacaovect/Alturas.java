package fixacaovect;

import java.util.Scanner;

public class Alturas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, count = 0;
		double medialt, somalt = 0;
		
		System.out.print("Quantas pessoas serão digitadas? ");
		n = sc.nextInt();
		Pessoas[] pessoa = new Pessoas[n];
		
		for(int i=0; i<pessoa.length; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			
			somalt += altura;
			
			pessoa[i] = new Pessoas(nome, idade, altura);
			if(idade < 16) {
				count++;
			}
		}
		
		System.out.println();
		
		medialt = somalt/n;
		System.out.printf("Altura média: %.2f%n", medialt);
		System.out.println("Pessoas com menos de 16 anos: " + (count*100/n) + "%");
		
		for(int i=0; i<pessoa.length; i++) {
			if(pessoa[i].getIdade() < 16) {
				System.out.println(pessoa[i].getNome());
			}
		}
		
	}
	
}
