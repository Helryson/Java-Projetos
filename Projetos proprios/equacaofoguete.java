// Este programa irá servir para calcular a variaçao de velocidade necessaria para um foguete atingir a orbita.
// Ele calcula de acordo com a massa inicial e a final, alem do sistema tambem ser afetado pelo impulso específico do motor.
import java.util.Scanner;
public class equacaofoguete {
    public static void main(String[] args){

        Scanner tecla = new Scanner(System.in);
        Double DeltaV, isp, g0, m0, mf, lnM;

        System.out.println("Calculo da variaçao de velocidade par aum foguete entrar em órbita.");
        System.out.print("Impulso específico do motor(s): ");
        isp = tecla.nextDouble();
        System.out.print("Aceleração da gravidade(m/s2): ");
        g0 = tecla.nextDouble();
        System.out.print("Massa inicial do foguete(kg): ");
        m0 = tecla.nextDouble();
        System.out.print("Massa final do foguete(kg): ");
        mf = tecla.nextDouble();
            
        lnM = Math.log(m0/mf);

        DeltaV = isp*g0*lnM;
        System.out.println(lnM);

        System.out.print("A variação de velocidade para atingir a orbita é de " + DeltaV + " m/s");

    }
}