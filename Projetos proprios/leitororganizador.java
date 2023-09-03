import java.util.Arrays;
import java.util.Scanner;
public class leitororganizador {
    public static void main(String[] args){

        Scanner tecla = new Scanner(System.in);
        String[] nome = new String[7];
        int i;

        for(i = 0; i <= 6; i++){
            System.out.print("Insira o " + (i+1) + " nome: ");
            nome[i] = tecla.nextLine();
        }

        Arrays.sort(nome);
        
        for(i = 0; i <= 6; i++){
            if(i == 6){
                System.out.print(nome[i] + ".");
            }
            else{
                System.out.print(nome[i] + ", ");
            }
        }

        for(i = 0; i < args.length; i++){
            System.out.print(args[i] + " ola.");
        }

    }    
}
