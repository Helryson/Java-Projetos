import java.util.Scanner;
public class leitorparimpar {
    public static void main(String[] args){

        Scanner tecla = new Scanner(System.in);
        int[] par = new int[6], impar = new int[6], a = new int[6];
        int i;

        for(i = 0; i < a.length; i++){

            System.out.print("Insira o " + (i+1) + "º valor: ");
            a[i] = tecla.nextInt();

            if(a[i] %2 == 0){
                par[i] = a[i];
            }
            else{
                impar[i] = a[i];
            }
        }

        System.out.print("Valores pares: ");

        for (i = 0; i < par.length; i++) {
            if (par[i] != 0) {
                System.out.print(par[i] + " ");
            }
        }

        System.out.print("\nValores ímpares: ");

        for(i = 0; i < impar.length; i++){
            if(impar[i] != 0){
                System.out.print(impar[i] + " ");
            }
        }

    }
}
