import java.util.Scanner;
public class ex6 {
    public static void main(String[] args){
        Scanner tecla = new Scanner(System.in);
        int[][] a = new int[3][3];
        int i, j;
        boolean vf = true;

        for(i=0; i<a.length; i++){
            for(j= 0; j<a.length; j++){
                a[i][j] = tecla.nextInt();
            }
        }
        for(i=0; i<a.length; i++){
            for(j= 0; j<a.length; j++){
                if(a[i][j] != a[j][i]){
                    vf = false;
                }
            }
        }
        for(i=0; i<a.length; i++){
            for(j= 0; j<a.length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
        if(vf == false){
            System.out.print("Assimétrico");
        }
        else{
            System.out.print("Simétrico");
        }
    }
}
