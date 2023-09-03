import java.util.Random;

public class DiceRoller {

    DiceRoller(){
        int numberio = 0;
        Random randomio = new Random();
        roll(randomio);
    }
 
    void roll(Random random) {
        int number = random.nextInt(6)+1;
        System.out.println(number);
    }

 public class Main {

    public static void main(String[] args) {
        
     DiceRoller diceRoller = new DiceRoller();
     
    }
   }
}