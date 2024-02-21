package entidade;
import java.util.Scanner;
import entidade.Atividade1;

public class Atividade1exe {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Atividade1 retangulo = new Atividade1();
		
		System.out.println("Insira a largura e altura do retângulo:");
		retangulo.largura = sc.nextDouble();
		retangulo.altura = sc.nextDouble();
		
		System.out.println("Area = " + retangulo.area());
		
		System.out.println("Perimetro = " + retangulo.perimetro());
		
		System.out.println("Diagonal = " + retangulo.diagonal());
		
	}
}
