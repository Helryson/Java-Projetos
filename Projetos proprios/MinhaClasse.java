import java.util.Scanner;
public class MinhaClasse {
    

    public static void main(String[] args) {
        MinhaClasse instancia = new MinhaClasse();
        int intValue = 5/2;
        double doubleValue = (double)intValue;
        System.out.print(doubleValue);
        Scanner tecla = new Scanner(System.in);
        int[] a = new int[tecla.nextInt()];
        System.out.print(plusOne(a));
        
    }

    public static int[] plusOne(int[] digits){
        int max = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}