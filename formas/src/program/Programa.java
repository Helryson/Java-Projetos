package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import formas.Circle;
import formas.Color;
import formas.Rectangle;
import formas.Shape;

public class Programa {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Shape> list = new ArrayList<>();
		Locale.setDefault(Locale.US);
		
		System.out.print("Enter the number of shapes: ");
		int shapeQnt = sc.nextInt();
		
		for(int i=0; i<shapeQnt; i++) {
			System.out.println("Shape #" + (i+1) + "data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char shapeSlc = sc.next().charAt(0);
			System.out.print("Color(BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			
			if(shapeSlc == 'r') {
				System.out.print("Width: ");
				Double width = sc.nextDouble();
				System.out.print("Height: ");
				Double height = sc.nextDouble();
				
				Rectangle retangulo = new Rectangle(color, width, height);
				
				list.add(retangulo);
			}
			
			else if(shapeSlc == 'c') {
				System.out.print("Radius: ");
				Double radius = sc.nextDouble();
				
				Circle circulo = new Circle(color, radius);
				
				list.add(circulo);
			}
		}
		
		System.out.println("SHAPE AREAS: ");
		for(Shape s : list) {
			System.out.printf("%.2f%n", s.area());
		}
		
	}
}
