package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import backp.Pessoa;
import backp.PessoaFisica;
import backp.PessoaJuridica;

public class Programa {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> list = new ArrayList<>();
		Double soma = 0.0;
		
		System.out.print("Enter the number of tax payers: ");
		int nTaxP = sc.nextInt();

		for (int i = 0; i < nTaxP; i++) {
			System.out.println("Tax payer #" + (i+1) + (" data:"));
			System.out.print("Individual or company (i/c)? ");
			char accType = sc.next().charAt(0);
			
			if (accType == 'i') {
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Anual income: ");
				Double anualIncome = sc.nextDouble();
				System.out.print("Health expenditures: ");
				Double gastoSaude = sc.nextDouble();
				
				PessoaFisica pessoaFisica = new PessoaFisica(name, anualIncome, gastoSaude);
				list.add(pessoaFisica);
			}
			else {
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Anual income: ");
				Double anualIncome = sc.nextDouble();
				System.out.print("Number of employes: ");
				int gastoSaude = sc.nextInt();
				
				PessoaJuridica pessoaJuridica = new PessoaJuridica(name, anualIncome, gastoSaude);
				list.add(pessoaJuridica);
			}
		}
		
		System.out.println();
		
		for(Pessoa a : list) {
			System.out.println("TAXES PAID:");
			System.out.println(a.getNome() + ": $ " + a.calcImposto());
			soma +=a.calcImposto();
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + soma);
		
	}
}
