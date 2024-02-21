package Atividadelista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aumento {
	public static void main(String[] args) {
		
		List<Funcionarios> listf = new ArrayList();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos funcionários serão registrados?");
		int ID, n = sc.nextInt();
		System.out.println();
		
		
		for(int i=0; i<n; i++) {
			System.out.println("Empregado #" + (i+1));
			System.out.print("ID: ");
			ID = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Salário: ");
			double salario = sc.nextDouble();
			
			Funcionarios funcionario = new Funcionarios(ID, nome, salario);

			listf.add(funcionario);
		}
		
		System.out.print("Insira o ID do funcionário que terá o salário aumentado: ");
		int idsalario = sc.nextInt();
		Integer pos = position(listf, idsalario);
		if(pos == null) {
			System.out.println("Este ID não existe na base");
		}
		else {
			System.out.print("Insira a porcentagem: ");
			double porcentagem = sc.nextDouble();
			listf.get(pos).aumentaSalario(porcentagem);
		}
		
		System.out.println();
		
		System.out.println("Lista de funcionários:");
		for(int i=0; i <listf.size(); i++) {
			System.out.println(listf.get(i).toString());
		}
		sc.close();
		
}
	
		public static Integer position(List<Funcionarios> list, int id) {
			for(int i=0; i< list.size(); i++) {
				if(list.get(i).getID() == id) {
					return i;
				}
			}
			return null;
		}
}

