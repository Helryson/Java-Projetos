import java.util.Locale;
import entidades.Triangulo;
import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Insira as medidas do triângulo X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Insira as medidas do triângulo Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double tX = x.calculaArea();
		
		double tY = y.calculaArea();
		
		System.out.println("Area do triângulo X: " + tX);
		System.out.println("Area do triângulo Y: " + tY);
		
		if(tX > tY) {
			System.out.println("Maior área: X");
		}
		else {
			System.out.println("Maior área: Y");
		}
	
	}

}
