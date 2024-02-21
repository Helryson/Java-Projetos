package exdois;

public class RecursosHumanos {
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public String toString() {
		return nome + ", $" + salarioLiquido();
	}
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public void aumentaSalario(double porcentagem) {
		
		salarioBruto = salarioBruto + (salarioBruto/porcentagem);
	}
}
