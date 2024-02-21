package app;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.ContratoHora;
import entities.Departamento;
import entities.Trabalhador;
import entities.enums.WorkerLevel;

public class Programa {
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Scanner sc = new Scanner(System.in);
		String departamento, nome, nivel;
		double salario_base;
		int qnt_contrato;
		
		System.out.print("Insira o nome do departamento: ");
		departamento = sc.nextLine();
		
		System.out.println("Insira os dados do trabalhador: ");
		System.out.print("Nome: ");
		nome = sc.nextLine();
		System.out.print("Nível: ");
		nivel = sc.nextLine();
		System.out.print("Salário base: ");
		salario_base = sc.nextDouble();
		System.out.print("Quantos contratos para este trabalhador? ");
		qnt_contrato = sc.nextInt();
		
		Trabalhador trabalhador = new Trabalhador(nome, WorkerLevel.valueOf(nivel), salario_base, new Departamento(departamento));
		
		for(int i=1; i<= qnt_contrato; i++) {
			System.out.println("Insira os dados do contrato #" + i+1 + ":");
			System.out.print("Data (DD/MM/YYYY):");
			Date dataContrato = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valorPH = sc.nextDouble();
			System.out.print("Duração(horas): ");
			int duracao = sc.nextInt();
			
			ContratoHora contratoHora = new ContratoHora(dataContrato, valorPH, duracao);
			trabalhador.addContrato(contratoHora);
		}
		
		System.out.print("Insira mês e ano para calcular o total (MM/YYYY): ");
		String incomeDate = sc.next();
		int mes = Integer.parseInt(incomeDate.substring(0, 2));
		int ano = Integer.parseInt(incomeDate.substring(3));
		
		System.out.println("Nome: " + trabalhador.getName());
		System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
		System.out.println("Renda total para " + incomeDate + ": " + trabalhador.income(ano, mes));
		
	}
	
}