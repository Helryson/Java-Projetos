package exdois;
import exdois.RecursosHumanos;
import java.util.Scanner;
public class rh {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		RecursosHumanos funcionario = new RecursosHumanos();
		
		System.out.print("Nome: ");
		funcionario.nome = sc.nextLine();
		System.out.print("Salario Bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		funcionario.imposto = sc.nextDouble();
		
		System.out.println("Funcionário: " + funcionario);
		
		System.out.print("Qual a porcentagem para aumentar o salário? ");
		double porcentagem = sc.nextDouble();
		funcionario.aumentaSalario(porcentagem);
		
		System.out.println("Atualização dos dados: " + funcionario);
	}
	
}
