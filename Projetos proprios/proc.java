import java.util.Scanner;
public class proc {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        int x = tecla.nextInt();
        int y = tecla.nextInt();
        meuProcedimento(x, y);
        System.out.print(x + " " + y);

    }
    
    public static void meuProcedimento(int b, int a){
        int soma;
        if(a % 2 == 0 && b % 2 == 0){
            soma = a + b;
            System.out.println("A soma de " + a + " e " + b + " é par: " + soma);
        }
        else{
            System.out.println("Tente de novo");
        }
    }
}