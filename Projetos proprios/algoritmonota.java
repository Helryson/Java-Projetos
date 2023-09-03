import java.util.Scanner;
public class algoritmonota {
    public static void main(String[] args){

        Scanner tecla = new Scanner(System.in);
        Double nota1, nota2, nota_final;

        System.out.print("Insira a nota da primeira prova: ");
        nota1 = tecla.nextDouble();

        while(nota1 < 0 || nota1 > 100){
            System.out.println("Nota inválida!");
            System.out.print("Insira a nota da primeira prova: ");
            nota1 = tecla.nextDouble();
        }

            System.out.print("Insira a nota da segunda prova: ");
            nota2 = tecla.nextDouble();
            
        while(nota2 < 0 || nota2 > 100){
            System.out.println("Nota inválida!");
            System.out.print("Insira a nota da segunda prova: ");
            nota2 = tecla.nextDouble();
        }

        nota_final = (nota1 + nota2)/2;
        if(nota_final >= 70){
            System.out.print("APROVADO!");
        }
        else if(nota_final >= 60 && nota_final < 70){
            System.out.print("EXAME!");
        }
        else if(nota_final <  60){
            System.out.print("REPROVADO!");
        }


    }
}