import java.util.Scanner;
public class proc1 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        int x = 5;
        int y = 10;
        
        meuProcedimento(x, y);
        
        System.out.println("x: " + x); // O valor de x foi modificado dentro do método
        System.out.println("y: " + y); // O valor de y foi modificado dentro do método
    }
    
    public static void meuProcedimento(int b, int a) {
        b = b + 1; // Modifica o valor de b
        a = a + 1; // Modifica o valor de a
    }
}