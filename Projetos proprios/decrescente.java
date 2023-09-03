import java.util.Scanner;
public class decrescente {
    public static void main(String[] args){

        Scanner tecla = new Scanner(System.in);
        int[] dec = new int[10];
        int i;

        for(i = 0; i <= 9; i++){
            System.out.print("Insira o " + (i+1) + " número: ");
            dec[i] = tecla.nextInt();
        }

        for(i = 9; i >= 0; i--){
            System.out.print(dec[i] + " ");
        }

    }    
}
