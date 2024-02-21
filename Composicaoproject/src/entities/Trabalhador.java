package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Trabalhador {
		private String name;
		private Double baseSalary;
		private Departamento departamento;
		  
		private List<ContratoHora> contratos = new ArrayList<>();
		private WorkerLevel level; 
		
		public Trabalhador() {
		}

		public Trabalhador(String name, WorkerLevel level, Double baseSalary, Departamento departamento) {
			this.name = name;
			this.level = level;
			this.baseSalary = baseSalary;
			this.departamento = departamento;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public WorkerLevel getLevel() {
			return level;
		}

		public void setLevel(WorkerLevel level) {
			this.level = level;
		}

		public Double getBaseSalary() {
			return baseSalary;
		}

		public void setBaseSalary(Double baseSalary) {
			this.baseSalary = baseSalary;
		}

		public Departamento getDepartamento() {
			return departamento;
		}

		public void setDepartamento(Departamento departamento) {
			this.departamento = departamento;
		}

		public List<ContratoHora> getContratos() {
			return contratos;
		}	

		public void addContrato(ContratoHora contrato) {
			contratos.add(contrato);
		}
		
		public void removeContrato(ContratoHora contrato) {
			contratos.remove(contrato);
		}
		
		public double income(int ano, int mes) {
			double sum = baseSalary;
			Calendar calendario = Calendar.getInstance();
			for(ContratoHora c : contratos) {
				calendario.setTime(c.getData());
				int c_ano = calendario.get(Calendar.YEAR);
				int c_mes = 1 + calendario.get(Calendar.MONTH);
				if(mes == c_mes && ano == c_ano) {
					sum += c.totalValue();
				}
			}
			return sum;
		}
}
