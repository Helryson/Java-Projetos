import java.util.ArrayList;
import java.util.Scanner;

public class fibo {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int qnt = sc.nextInt();
        int x=0, y, z=0;

        if(qnt == 0){
            throw new IllegalArgumentException("Valor inválido");
        }

        if(qnt == 1){
            System.out.println(z);
        }
        else{
            for(int i=0; i<qnt; i++){
                y=z;
                System.out.print(z + " ");
                if (z == 0) {
                    z = 1;
                }
                z=z+x;
                x=y;
            }
        }
    }
}
