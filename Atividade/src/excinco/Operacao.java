package excinco;
import java.util.Scanner;
import excinco.Conta;

public class Operacao {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.print("Insira o número da conta: ");
		int nConta = sc.nextInt();
		System.out.print("Entre com o nome da conta: ");
		sc.nextLine();
		String nome = sc.nextLine();
		
		System.out.print("Há um depósito inicial (s/n)?");
		char rep = sc.next().charAt(0);
		
		if(rep == 's') {
			System.out.print("Insira um valor inicial: ");
			double deposito = sc.nextDouble();
			conta = new Conta(nome, nConta, deposito);
		}
		else {
			conta = new Conta(nome, nConta);
		}
		
		System.out.println(conta.toString());
		
		System.out.println();
		
		System.out.print("Insira um valor a ser depositado: ");
		double deposito = sc.nextDouble();
		conta.deposita(deposito);
		System.out.println(conta.toString());
		
		System.out.println();
		
		System.out.print("Insira um valor a ser sacado: ");
		double saque = sc.nextDouble();
		conta.saque(saque);
		System.out.println(conta.toString());
		
	}
}
