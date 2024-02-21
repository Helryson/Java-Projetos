package extres;

public class Aluno {
	
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaFinal() {
			return nota1 + nota2 + nota3;
	}
	
	public void aprovacao() {
		if(notaFinal() >= 60) {
			System.out.println("Nota Final: " + notaFinal());
			System.out.println("PASSOU!");
		}
		else {
			System.out.println("Nota Final: " + notaFinal());
			System.out.println("REPROVOU");
			System.out.println("Faltam " + (60 - notaFinal()) + " pontos");
		}
	}
}
