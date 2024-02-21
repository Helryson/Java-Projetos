package extres;
import java.util.Scanner;
import extres.Aluno;

public class Alunoex {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.print("Insira o nome do aluno: ");
		aluno.nome = sc.nextLine();
		System.out.print("Insira a primeira nota: ");
		aluno.nota1 = sc.nextDouble();
		System.out.print("Insira a segunda nota: ");
		aluno.nota2 = sc.nextDouble();
		System.out.print("Insira a terceira nota: ");
		aluno.nota3 = sc.nextDouble();
		
		aluno.aprovacao();
		
		sc.close();
		
	}
	
}
